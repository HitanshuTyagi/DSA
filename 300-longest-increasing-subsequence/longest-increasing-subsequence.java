class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        Integer[][]dp=new Integer[n+1][n+1];
        return solve(dp,nums,0,-1);
    }
    int solve(Integer[][]dp,int[]nums,int i,int j){
        if(i==nums.length)return 0;
        if(dp[i][j+1]!=null)return dp[i][j+1];

        int nottake=solve(dp,nums,i+1,j);
        int take=0;
        if(j==-1 || nums[i]>nums[j]){
            take=1+solve(dp,nums,i+1,i);
        }
        return dp[i][j+1]=Math.max(take,nottake);
    }
}