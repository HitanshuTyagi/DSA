class Solution {
    public int mySqrt(int x) {
        if(x<2)return x;
        int ans=0;
        for(long i=1;i<=x/2;i++){
            long mul=i*i;
            if(mul<=x){
                ans=(int)i;
            }
            else{
                break;
            }
        }
        return ans;
    }
}