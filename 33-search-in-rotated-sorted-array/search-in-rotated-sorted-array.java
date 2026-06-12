class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
        int a=solve(nums,0,pivot,target);
        int b=solve(nums,pivot+1,nums.length-1,target);
        if(a==-1)return b;
        return a;
    }
    public int solve(int[]arr,int s,int e,int target){
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
    public int pivot(int[]arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m>s && arr[m]<arr[m-1]){
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