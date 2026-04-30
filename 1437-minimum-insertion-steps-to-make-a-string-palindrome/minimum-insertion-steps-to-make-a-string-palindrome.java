class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        Integer[][]dp=new Integer[n][n];
        return solve(s,0,n-1,dp);
    }
    public int solve(String s,int i,int j,Integer[][]dp){
        if(i>=j)return 0;
        if(dp[i][j]!=null)return dp[i][j];
        
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=solve(s,i+1,j-1,dp);
        }
        else{
            int left=solve(s,i+1,j,dp);
            int right=solve(s,i,j-1,dp);
            dp[i][j]=1+Math.min(left,right);
        }
        return dp[i][j];
    }
}
// class Solution {
//     public int minChar(String s) {
//         // code here
//         int n=s.length();
//         Integer[][]dp=new Integer[n][n];
//         return solve(s,0,n-1,dp);
//     }
//     public int solve(String s,int i,int j,Integer[][]dp){
//         if(i>=j)return 0;
//         if(dp[i][j]!=null)return dp[i][j];
        
//         if(s.charAt(i)==s.charAt(j)){
//             dp[i][j]=solve(s,i+1,j-1,dp);
//         }
//         else{
//             int left=solve(s,i+1,j,dp);
//             int right=solve(s,i,j-1,dp);
//             dp[i][j]=1+Math.min(left,right);
//         }
//         return dp[i][j];
//     }
// }