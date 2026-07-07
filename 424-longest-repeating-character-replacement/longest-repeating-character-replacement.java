class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int max=0;
        int maxfreq=0;
        int[]freq=new int[26];
        for(int end=0;end<s.length();end++){
            freq[s.charAt(end)-'A']++;

            maxfreq=Math.max(maxfreq,freq[s.charAt(end)-'A']);

            while((end-start+1)-maxfreq>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}