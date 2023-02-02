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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        int length = 0;
        ListNode current = head;
        while(current != null){
            length+=1;
            current = current.next;
        }
        int half = 0;
        if(length % 2 == 0){        
            half = (length/2);
        }else{
            half = (length/2)+1;    
        }
        ListNode halfway = head;
        int i = 0;
        while(i<half){
            i+=1;
            halfway = halfway.next;
        }
        current = head;
        
        ListNode temp = null;
        ListNode prev = halfway;
        while(halfway!=null){
            temp = halfway.next;
            halfway.next = prev;
            prev = halfway;
            halfway = temp;
        }
        halfway = prev;
        if(length%2 != 0){
            i-=1;
        }
        while(i > 0){
            if(halfway.val != current.val){
                return false;
            }
            halfway = halfway.next;
            current = current.next;
            i-=1;
        }
        return true;
    }
}
