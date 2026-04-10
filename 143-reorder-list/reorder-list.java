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
        if(head==null)return;

        ArrayList<Integer>li=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=li.size()-1;
        while(i<=j){
            if(i==j){
                res.add(li.get(i));
            }
            else{
                res.add(li.get(i));
                res.add(li.get(j));
            }
            i++;
            j--;
        }
        
        temp=head;
        int k=0;
        while(temp!=null){
            temp.val=res.get(k++);
            temp=temp.next;
        }
    }
}