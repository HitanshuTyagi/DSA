class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        int e=0;
        for(int x:weights){
            s=Math.max(s,x);
            e+=x;
        }

        while(s<=e){
            int m=s+(e-s)/2;
            int d=1;
            int currw=0;

            for(int w:weights){
                if(w+currw>m){
                    d++;
                    currw=w;
                }
                else{
                    currw+=w;
                }
            }
            if(d<=days){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}