class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        int[]points=new int[max+1];
        for(int num:nums){
            points[num]+=num;
        }
        Integer[]dp=new Integer[max+1];
        return solve(max,dp,points);
    }
    public int solve(int i,Integer[]dp,int[]points){
        if(i<0)return 0;
        if(i==0)return points[0];
        
        if(dp[i]!=null)return dp[i];

        int take=points[i]+solve(i-2,dp,points);
        int nottake=solve(i-1,dp,points);

        return dp[i]=Math.max(take,nottake);
    }
}