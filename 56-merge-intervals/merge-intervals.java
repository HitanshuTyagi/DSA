class Solution {
    public int[][] merge(int[][] intervals) {
    //   if(intervals.length==0)return new int[0][0];

    //   Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    //   ArrayList<int[]>li=new ArrayList<>();

    //   int start=intervals[0][0];
    //   int end=intervals[0][1];

    //   for(int i=1;i<intervals.length;i++){
    //     if(intervals[i][0]<=end){
    //         end=Math.max(intervals[i][1],end);
    //     }
    //     else{
    //         li.add(new int[]{start,end});
    //         start=intervals[i][0];
    //         end=intervals[i][1];
    //     }
    //   }
    //   li.add(new int[]{start,end});

    //   return li.toArray(new int[li.size()][]); 

    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    int start=intervals[0][0];
    int end=intervals[0][1];
    ArrayList<int[]>li=new ArrayList<>();
    for(int i=0;i<intervals.length;i++){
        if(intervals[i][0]<=end){
            end=Math.max(intervals[i][1],end);
        }
        else{
            li.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        }
    }
    li.add(new int[]{start,end});
    return li.toArray(new int[li.size()][]);
    }
}