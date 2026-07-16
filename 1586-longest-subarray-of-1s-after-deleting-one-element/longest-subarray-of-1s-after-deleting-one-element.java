class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int one=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)one++;
            else zero++;
        }
        if(zero==0)return nums.length-1;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            boolean flag=false;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    cnt++;
                }
                else if(nums[j]==0 && !flag){
                    flag=true;
                }
                else if(nums[j]==0 && flag){
                    max=Math.max(max,cnt);
                    break;
                }
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}