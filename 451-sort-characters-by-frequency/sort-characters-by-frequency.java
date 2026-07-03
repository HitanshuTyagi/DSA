class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character,Integer>>li=new ArrayList<>(map.entrySet());
        li.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>mp:li){
            char key=mp.getKey();
            int val=mp.getValue();

            for(int i=0;i<val;i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}