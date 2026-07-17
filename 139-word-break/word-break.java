class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Set<String>set=new HashSet<>(wordDict);
        Boolean[]dp=new Boolean[n+1];
        return solve(s,dp,set,0);
    }
    public boolean solve(String s,Boolean[]dp,Set<String>set,int start){
        if(start==s.length())return true;
        if(dp[start]!=null)return dp[start];

        for(int end=start+1;end<=s.length();end++){
            String str=s.substring(start,end);
            if(set.contains(str) && solve(s,dp,set,end)){
                return dp[start]=true;
            }
        }
        return dp[start]=false;
    }
}