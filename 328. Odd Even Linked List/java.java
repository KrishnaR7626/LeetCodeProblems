/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode oddheadptr = head;
        ListNode evenHead = null;
        ListNode evenHeadptr = null;
        ListNode current = head;
        int index = 1;
        while(current!=null){
            if(index % 2 == 0){
                if(evenHead == null){
                    evenHead = current;
                    evenHeadptr = current;
                }else{
                    evenHeadptr.next = current;
                    evenHeadptr = evenHeadptr.next;
                }
            }else{
                if(index != 1){
                    oddheadptr.next = current;
                    oddheadptr = oddheadptr.next;                    
                }
            }
            index+=1;
            current = current.next;
        }
        evenHeadptr.next = null;
        oddheadptr.next = evenHead;
        return head;
    }
    
}
