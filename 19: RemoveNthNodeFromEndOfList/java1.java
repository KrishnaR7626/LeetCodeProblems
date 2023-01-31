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
        if(head == null){
            return head;
        }
        ListNode current = head;
        int length = 1;
        while(current.next!=null){
            current = current.next;
            length+=1;
        }      
        int index = length-n;
        int counter = 1;
        current = head;
        if(index == 0){
            return head.next;
        }        
        while(current.next != null){
            if(index == counter){
                ListNode temp = current.next;
                current.next = temp.next;
                return head;
            }
            current = current.next;
            counter+=1;
        }
        return head;
    }
}
