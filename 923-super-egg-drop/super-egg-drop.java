class Solution {
    public int superEggDrop(int e ,int f) {
        Integer[][]dp=new Integer[e+1][f+1];
        return solve(dp,e,f);
    }
    public int solve(Integer[][]dp,int e,int f){
        if(f==0 || f==1)return f;
        if(e==1)return f;

        if(dp[e][f]!=null)return dp[e][f];

        int ans=Integer.MAX_VALUE;
        int low=1;
        int high=f;
        while(low<=high){
            int mid=low+(high-low)/2;

            int breakcase=solve(dp,e-1,mid-1);
            int notbreak=solve(dp,e,f-mid);

            int worst=1+Math.max(breakcase,notbreak);

            if(breakcase>notbreak){
                high=mid-1;
                ans=Math.min(ans,worst);
            }
            else{
                low=mid+1;
                ans=Math.min(ans,worst);
            }
        }
        return dp[e][f]=ans;
    }
}