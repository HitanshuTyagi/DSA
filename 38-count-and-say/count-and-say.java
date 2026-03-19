class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=2;i<=n;i++){
            String temp="";
            int cnt=1;
            for(int j=1;j<ans.length();j++){
                if(ans.charAt(j)==ans.charAt(j-1)){
                    cnt++;
                }
                else{
                    temp+=cnt+""+ans.charAt(j-1);
                    cnt=1;
                }
            }
            temp+=cnt+""+ans.charAt(ans.length()-1);
            ans=temp;
        }
        return ans;
    }
}