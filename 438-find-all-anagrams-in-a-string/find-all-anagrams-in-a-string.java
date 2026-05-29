class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        if(p.length()>s.length())return li;
        int[]pfreq=new int[26];
        int[]win=new int[26];

        for(char c:p.toCharArray()){
            pfreq[c-'a']++;
        }
        int k=p.length();

        for(int i=0;i<s.length();i++){
            win[s.charAt(i)-'a']++;

            if(i>=k){
                win[s.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(win,pfreq)){
                li.add(i-k+1);
            }
        }
        return li;
    }
}