class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(String s:patterns){
            int index=word.indexOf(s);
            if(index!=-1)cnt++;
        }
        return cnt;
    }
}