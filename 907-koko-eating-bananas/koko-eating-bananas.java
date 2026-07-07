class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=0;
        for(int p:piles){
            e=Math.max(e,p);
        }

        while(s<=e){
            int m=s+(e-s)/2;
            long hrs=0;

            for(int p:piles){
                hrs+=(p+m-1)/m;
            }

            if(hrs<=h){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}