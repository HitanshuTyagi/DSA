class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Boolean[]dp=new Boolean[n];
        Set<String>set=new HashSet<>(wordDict);
        return solve(s,set,dp,0);
    }
    public boolean solve(String s,Set<String>set,Boolean[]dp,int start){
        if(start==s.length())return true;
        if(dp[start]!=null)return dp[start];

        for(int end=start+1;end<=s.length();end++){
            String str=s.substring(start,end);
            if(set.contains(str) && solve(s,set,dp,end)){
                return dp[start]=true;
            }
        }
        return dp[start]=false;
    }
}