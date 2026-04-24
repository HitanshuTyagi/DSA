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
    public ListNode reverse(ListNode head){
        if(head==null)return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode forward=null;

        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow.next);
        slow.next=null;
        
        ListNode first=head;
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;

            first.next=second;
            second.next=t1;

            second=t2;
            first=t1;
        }
    }
}