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
    public ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode pt = result;

        int sum =0 ;
        head  = head.next;

        while( head!= null){
            if(head.val == 0){
                pt.next = new ListNode(sum);
                pt = pt.next;
                sum = 0;
            } else{
                sum += head.val;
            }
            head = head.next;
        }
        return result.next;
    }
}