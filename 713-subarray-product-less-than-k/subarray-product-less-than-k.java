class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int start=0;
        int product=1;
        int cnt=0;


        for(int end=0;end<nums.length;end++){
            product=product*nums[end];
            while(product>=k){
                product=product/nums[start];
                start++;
            }
            cnt+=(end-start+1);
        }
        return cnt;
    }
}