class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>li=new ArrayList<>();
        solve(li,n,0,0,"");
        return li;
    }
    public void solve(List<String>li,int n,int open,int close,String s){
        if(s.length()==2*n){
            li.add(s);
            return;
        }
        if(open<n){
            solve(li,n,open+1,close,s+"(");
        }
        if(close<open){
            solve(li,n,open,close+1,s+")");
        }
    }
}