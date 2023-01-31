/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode prev = null;
        int length = 0;
        while(current!=null){
            length+=1;
            current = current.next;
        }
        current = head;
        length-=n-1;
        while (current!=null){
            length-=1;
            if(length == 0){
                if(prev == null){
                    return head.next;
                }else{
                    prev.next = current.next;
                    return head;
                }
            }
            prev = current;
            current = current.next;
        }
        return head;
    }
}
