//https://leetcode.com/problems/merge-two-sorted-lists/
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
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode ret = null;
        if(list1.val< list2.val){
            ret = new ListNode(list1.val);
            ptr1 = ptr1.next;
        }else{
            ret = new ListNode(list2.val);
            ptr2 = ptr2.next;
        }
        ListNode retptr = ret;
        while(ptr1 != null && ptr2 !=null){
            if(ptr1.val > ptr2.val){
                retptr.next = new ListNode(ptr2.val);
                retptr = retptr.next;
                ptr2 = ptr2.next;
            }else if(ptr1.val < ptr2.val){
                retptr.next = new ListNode(ptr1.val);
                retptr = retptr.next;
                ptr1 = ptr1.next;                
            }else{
                retptr.next = new ListNode(ptr1.val);
                retptr = retptr.next;
                ptr1 = ptr1.next;               
            }
        }
        if(ptr1 == null){
            while(ptr2!=null){
                retptr.next = new ListNode(ptr2.val);
                retptr = retptr.next;
                ptr2 = ptr2.next;
            }
        }
        if(ptr2 == null){
            while(ptr1!=null){
                retptr.next = new ListNode(ptr1.val);
                retptr = retptr.next;
                ptr1 = ptr1.next;
            }
        }
        return ret;
    }
}
