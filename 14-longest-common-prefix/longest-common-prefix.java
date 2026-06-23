class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        for(int i=0;i<n;i++){
            String s=strs[i];
            s=s.toLowerCase();
            strs[i]=s;
        }
        int len=strs[0].length();
        for(int i=0;i<n;i++){
            len=Math.min(len,strs[i].length());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            String s1=strs[0];
            String s2=strs[n-1];
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        if(sb.length()==0)return "";
        return sb.toString();
    }
}