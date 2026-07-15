class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        int temp=n;
        for(int i=1;i<=2*n;i++){
            if(i%2==1){
                oddsum+=i;
            }
            else{
                evensum+=i;
            }
        }
        return gcd(oddsum,evensum);
    }
    int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0)return b;
        return a;
    }
}