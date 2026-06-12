class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        Set<Character>set=new HashSet<>();
        int max=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            max=Math.max(max,end-start+1);
            set.add(ch);
        }
        return max;
    }
}