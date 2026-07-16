class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if (arr.length == 1) {
            if (arr[0] == 0) n--;
            return n <= 0;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i+1]==0 && arr[i]==0){
                n--;
                arr[i]=1;
            }
            else if(i==arr.length-1 && arr[i-1]==0 && arr[i]==0){
                n--;
                arr[i]=1;
            }
             else if(i>0 && i<arr.length-2){
                if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0){
                    arr[i]=1;
                    n--;
                }
            }
        }
        return n<=0;
    }
}