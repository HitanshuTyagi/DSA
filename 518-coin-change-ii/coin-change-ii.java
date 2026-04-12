class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        Integer[][]dp=new Integer[n][amount+1];
        return solve(dp,amount,coins,n-1);
    }
    public int solve(Integer[][]dp,int amount,int[]coins,int i){
        if(amount==0)return 1;
        if(amount<0 || i<0)return 0;
        if(dp[i][amount]!=null)return dp[i][amount];

        int notTake=solve(dp,amount,coins,i-1);
        int take=solve(dp,amount-coins[i],coins,i);

        return dp[i][amount]=take+notTake;
    }
}