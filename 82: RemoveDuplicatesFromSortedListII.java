// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/
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
        // initializes 2 pointers
        ListNode current = head;
        ListNode prev = null;
        int num;
        // traverses the linked list
        while(current != null){
              // if the value of current and next node is same
              if(current.next != null && current.val == current.next.val){
                  // stores value in local variable
                  num = current.val;
                  // moves until the value is not the same
                  while(current != null && current.val == num){
                      current = current.next;
                  }
                  // if there are no nodes left and if there are no other values in the list other than the duplicates, returns null
                  if(current == null && prev  == null){
                    return current;
                  }
                  // if there are no nodes left terminates the list
                  if(current == null){
                    prev.next = null;
                  }
                  // if prev pointer is null sets head to current position to remove all previous positions, else sets prev pointer to current position
                  if(prev == null){
                     head = current; 
                  }else{
                      prev.next = current;
                  }                                        
              }else{
                  // iterates through the array
                  prev = current;
                  current = current.next;
              }
        }
        return head;
    }
}
