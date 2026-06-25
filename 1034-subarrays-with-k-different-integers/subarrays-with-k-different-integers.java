class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
    public int solve(int[]nums,int k){
        Map<Integer,Integer>map=new HashMap<>();
        int cnt=0;
        int start=0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.size()>k){
                int left=nums[start];
                map.put(left,map.getOrDefault(left,0)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start++;
            }
            cnt+=end-start+1;
        }
        return cnt;
    }
}