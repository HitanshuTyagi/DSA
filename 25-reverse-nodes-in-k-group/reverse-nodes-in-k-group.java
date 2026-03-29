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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }

        if(count<k)return head;
        
        ListNode prev=null;
        ListNode current=head;
        ListNode forward=null;

        int cnt=0;

        while(current!=null && cnt<k){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
            cnt++;
        }

        if(forward!=null){
            head.next=reverseKGroup(forward,k);
        }
        return prev;
        
    }
}