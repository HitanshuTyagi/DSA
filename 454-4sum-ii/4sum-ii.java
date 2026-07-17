class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int cnt=0;
        int n=nums1.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                int sum=i+j;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int k:nums3){
            for(int l:nums4){
                int target=-(k+l);
                if(map.containsKey(target))cnt+=map.get(target);
            }
        }
        return cnt;
    }
}