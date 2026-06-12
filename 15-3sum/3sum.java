class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])continue;

            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ArrayList<Integer>ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[start]);
                    ans.add(nums[end]);
                    li.add(new ArrayList<>(ans));
                    while(start<end && nums[start]==nums[start+1])start++;
                    while(start<end && nums[end]==nums[end-1])end--;
                    start++;
                    end--;
                }
                else if(sum<0){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return li;
    }
}