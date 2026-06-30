class Solution {
    public int maximumLength(int[] nums) {

        Map<Long,Integer>map=new HashMap<>();
        for(int x:nums)map.put((long)x,map.getOrDefault((long)x,0)+1);
        int cnt=0;
        for(Map.Entry<Long,Integer>mp:map.entrySet()){
            long curr=mp.getKey();
            if (curr == 1) {
            int freq = map.get(1L);

            if (freq % 2 == 0)
                freq--;

            cnt = Math.max(cnt, freq);
            continue;
        }
            int len=0;
            
            while(map.containsKey(curr)){
                int freq=map.get(curr);

                if(freq>=2){
                    len+=2;
                    curr=curr*curr;
                }
                else{
                    len+=1;
                    break;
                }
            }
            if(!map.containsKey(curr))len--;
            cnt=Math.max(len,cnt);
        }
        return cnt;
    }
}