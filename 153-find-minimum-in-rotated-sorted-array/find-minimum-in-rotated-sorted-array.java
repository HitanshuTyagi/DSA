class Solution {
    public int findMin(int[] nums) {
        int ans=pivot(nums);
        return nums[ans+1];
    }
    public int pivot(int[]arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m>s && arr[m-1]>arr[m]){
                return m-1;
            }
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(arr[s]<arr[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}