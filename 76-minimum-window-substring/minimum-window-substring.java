class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int[]freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int count=t.length();
        int left=0;
        int right=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;

        while(right<s.length()){
            if(freq[s.charAt(right)]>0){
                count--;
            }
            freq[s.charAt(right)]--;
            right++;

            while(count==0){
                if(right-left<minlen){
                    minlen=right-left;
                    start=left;
                }

                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}