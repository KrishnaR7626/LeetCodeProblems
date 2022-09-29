/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    struct ListNode * ptr = head;
    int length = 0;
    while(ptr != NULL){
        ptr = ptr->next;
        length += 1;
    }
    int index = (length/2);
    int i = 0;
    ptr = head;
    while(ptr != NULL){
        if(index == i){
            return ptr;
        }
        ptr = ptr->next;
        i += 1;
    }
    return NULL;
}
