class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> li=new ArrayList<>();
        solve(li,ans,s,0);
        return ans;
    }
    public void solve(List<String>li,List<List<String>>ans,String s,int start){
        if(start==s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                li.add(s.substring(start,end+1));
                solve(li,ans,s,end+1);
                li.remove(li.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}