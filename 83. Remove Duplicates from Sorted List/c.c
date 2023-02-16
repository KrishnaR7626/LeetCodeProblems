/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    if(head == NULL || head->next == NULL){
        return head;
    }
    struct ListNode * current = head->next;
    struct ListNode * prev = head;
    while(current != NULL){
        if(current->val == prev->val){
            prev->next = current->next;
        }else{
            prev = current;
        }
        current = current->next;
    }
    return head;
}
