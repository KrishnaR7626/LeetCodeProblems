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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        int length = 1;
        while(current.next!=null){
            current = current.next;
            length+=1;
        }
        int index = ((int)(length/2))+1;
        int ptr = 1;
        current = head;
        while(current.next!=null){
            if(ptr == index){
                return current;
            }
            current = current.next;
            ptr+=1;
        }
        return current;
    }
}
