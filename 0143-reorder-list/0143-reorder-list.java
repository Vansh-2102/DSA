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
    public void reorderList(ListNode head) {
        ListNode slow=head, fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow,prev=null,next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        slow=head;
        ListNode first = slow, sec=prev;


        while(sec.next!=null){
           ListNode a=first.next,b=sec.next;
           first.next=sec;
           sec.next=a;
           first=a;
           sec=b;
        }
        

        
    }
}