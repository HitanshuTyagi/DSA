class Solution {
    public boolean increasingTriplet(int[] arr) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=first){
                first=arr[i];
            }
            else if(arr[i]<=second){
                second=arr[i];
            }
            else{
                return true;
            }
        }
        return false;
        // not workig
        // int start=0;
        // int end=arr.length-1;
        // int cnt=1;
        // while(start<end){
        //     if(arr[end]>arr[start]){
        //         cnt++;
        //         end--;
        //     }
        //     else{
        //         start++;
        //     }
        //     if(cnt==3)return true;
        // }
        // return false;
    }
}