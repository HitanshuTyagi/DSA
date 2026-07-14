class Solution {
    public int climbStairs(int n) {
        Integer[]dp=new Integer[n+1];
        return solve(dp,n,0);
    }
    int solve(Integer[]dp,int n,int i){
        if(i==n)return 1;
        if(i>n)return 0;

        if(dp[i]!=null)return dp[i];
        int step1=solve(dp,n,i+1);
        int step2=solve(dp,n,i+2);

        return dp[i]=step1+step2;
    }
}