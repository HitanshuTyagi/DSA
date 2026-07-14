class Solution {
    public boolean judgeSquareSum(int c) {
        long sq=(long)Math.sqrt(c);
        long i=1;
        long j=sq;
        if(sq*sq==c)return true;
        while(i<=j){
            long sum=0;
            sum+=(i*i)+(j*j);
            if(sum<c){
                i++;
            }
            else if(sum>c){
                j--;
            }
            else{
                return true;
            }
        }
        System.out.print(sq);
        return false;
    }
}