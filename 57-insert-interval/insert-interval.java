class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>li=new ArrayList<>();
        int i=0;
        int n=intervals.length;

        while(i<n && intervals[i][1]<newInterval[0]){
            li.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        li.add(newInterval);

        while(i<n){
            li.add(intervals[i]);
            i++;
        }

        return li.toArray(new int[li.size()][]);
    }
}