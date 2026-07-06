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
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ArrayList<Integer> list = new ArrayList<>();

        // Store values in array
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Swap adjacent values
        for (int i = 0; i < list.size() - 1; i += 2) {
            int t = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, t);
        }

        // Put swapped values back into linked list
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;
    }
}