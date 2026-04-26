class Solution {
    class Node{
        int val,row,col;
        Node(int val,int row,int col){
            this.val=val;
            this.row=row;
            this.col=col;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        
        int max = Integer.MIN_VALUE;
        
        // Step 1: push first elements
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.add(new Node(val, i, 0));
            max = Math.max(max, val);
        }
        
        int start = 0, end = Integer.MAX_VALUE;
        
        // Step 2: process
        while (pq.size() == nums.size()) {
            Node curr = pq.poll();
            int min = curr.val;
            
            // update range
            if (max - min < end - start) {
                start = min;
                end = max;
            }
            
            // move pointer in that list
            if (curr.col + 1 < nums.get(curr.row).size()) {
                int nextVal = nums.get(curr.row).get(curr.col + 1);
                pq.add(new Node(nextVal, curr.row, curr.col + 1));
                max = Math.max(max, nextVal);
            }
        }
        
        return new int[]{start, end};
    }
}