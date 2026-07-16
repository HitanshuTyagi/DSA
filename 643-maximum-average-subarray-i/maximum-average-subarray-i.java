class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int start=0;
        double max=Double.NEGATIVE_INFINITY;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            double avg=0;
            if(end-start+1==k){
                avg=(double)sum/k;
                max=Math.max(avg,max);
                sum-=nums[start];
                start++;
            }
        }
        return max;
    }
}