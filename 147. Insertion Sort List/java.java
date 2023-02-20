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
    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        int [] a = new int [10001];
        while(current!=null){
            a[current.val+5000]++;
            current = current.next;
        }
        head = null;
        current = null;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i]; j++){
                if(head == null){
                    head = new ListNode(i-5000);
                    current = head;
                }else{
                    current.next = new ListNode(i-5000);
                    current = current.next;
                }
            } 
        }
        return head;

    }
}
