class Solution {
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int start=0;
        int max=0;
        int cnt=0;
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            if(isVowel(ch)){
                cnt++;
            }
            if(end-start+1==k){
                max=Math.max(cnt,max);
                if(isVowel(s.charAt(start)))cnt--;
                start++;
            }
        }
        return max;
    }
}