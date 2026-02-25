class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        if(k<0)return 0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int cnt=0;

        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>1){
                    cnt++;
                }
            }
            else{
                if(map.containsKey(k+key)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}