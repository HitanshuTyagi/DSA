class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        int[]freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }

        int start=0;
        int left=0;
        int right=0;
        int minlen=Integer.MAX_VALUE;
        int cnt=t.length();
        while(right<s.length()){
            if(freq[s.charAt(right)]>0){
                cnt--;
            }
            freq[s.charAt(right)]--;
            right++;

            while(cnt==0){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }

                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    cnt++;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}