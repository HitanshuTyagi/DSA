class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        Integer[]dp=new Integer[n+1];
        return solve(dp,s,0); 
    }
    public int solve(Integer[]dp,String s,int i){
        if(i==s.length())return 1;
        if(s.charAt(i)=='0')return 0;

        if(dp[i]!=null)return dp[i];

        int ways=solve(dp,s,i+1);

        if(i+1<s.length()){
            int num=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
            if(num>=10 && num<=26){
                ways+=solve(dp,s,i+2);
            }
        }
        return dp[i]=ways;
    }
}