class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }

        Arrays.sort(arr,(a,b)->b[0]-a[0]);

        int[][]topk=new int[k][2];

        for(int i=0;i<k;i++){
            topk[i][0]=arr[i][0];
            topk[i][1]=arr[i][1];
        }
        
        Arrays.sort(topk,(a,b)->a[1]-b[1]);

        int[]ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=topk[i][0];
        }
        return ans;
    }
}