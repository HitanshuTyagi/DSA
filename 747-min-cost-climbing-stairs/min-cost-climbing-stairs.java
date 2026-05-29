class Solution {
    public int minCostClimbingStairs(int[] nums) {
        int n=nums.length;
        Integer[]dp=new Integer[n+1];
        int ans=Math.min(solve(0,nums,dp),solve(1,nums,dp));
        return ans;
    }
    static int solve(int i,int []nums,Integer[]dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=null)return dp[i];

        return dp[i]=nums[i]+Math.min(solve(i+1,nums,dp),solve(i+2,nums,dp));
    }
}