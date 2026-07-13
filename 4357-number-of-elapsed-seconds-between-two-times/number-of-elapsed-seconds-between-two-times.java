class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[]word1=startTime.split(":");
        String[]word2=endTime.split(":");
        int ans=0;
        int h1=Integer.parseInt(word1[0]);
        int m1=Integer.parseInt(word1[1]);
        int s1=Integer.parseInt(word1[2]);
        int h2=Integer.parseInt(word2[0]);
        int m2=Integer.parseInt(word2[1]);
        int s2=Integer.parseInt(word2[2]);

        int first=(h1*3600)+(m1*60)+(s1);
        int second=(h2*3600)+(m2*60)+(s2);
        return second-first;
    }
}