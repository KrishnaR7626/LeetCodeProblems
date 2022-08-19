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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
              if(current.next != null && current.val == current.next.val){
                  int num = current.val;
                  while(current != null && current.val == num){
                      current = current.next;
                  }
                  if(prev == null){
                     head = current; 
                  }else{
                      if(current == null && prev  == null){
                        head = null;
                        return head;
                      }else if(current == null){
                        prev.next = null;
                        return head;
                      }
                      prev.next = current;
                  }
              }else{                  
                  prev = current;
                  current = current.next;
              }
        }
        return head;
    }
}
