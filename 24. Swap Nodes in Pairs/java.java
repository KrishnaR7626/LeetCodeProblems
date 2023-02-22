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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }else{
            ListNode current = head;
            ListNode next = current.next;
            current.next = next.next;
            next.next = current;
            head = next;
            if(current.next == null || current.next.next == null){
                return head;
            }else{
                current.next = swapPairs(current.next);
                return head;
            }
        }
    }
}
