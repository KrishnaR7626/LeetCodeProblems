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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = null;
        ListNode current = null;
        ListNode add = null;
        while(list1!=null && list2!=null){
            if(list1.val > list2.val){
                add = list2;
                list2 = list2.next;
            }else{
                add = list1;
                list1 = list1.next;                
            }
            if(head == null){
                head = add;
                current = head;
            }else{
                current.next = add;
                current = current.next;
            }
        }
        if(list1 == null){
            current.next = list2;
        }
        if(list2 == null){
            current.next = list1;
        }
        return head;
    }
}
