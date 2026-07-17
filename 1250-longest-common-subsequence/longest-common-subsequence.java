class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        Integer[][]dp=new Integer[n+1][m+1];
        return solve(dp,text1,text2,n-1,m-1);
    }
    int solve(Integer[][]dp,String s1,String s2,int i,int j){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=null)return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+solve(dp,s1,s2,i-1,j-1);
        }
        else{
            dp[i][j]=Math.max(solve(dp,s1,s2,i,j-1),solve(dp,s1,s2,i-1,j));
        }
        return dp[i][j];
    }
}