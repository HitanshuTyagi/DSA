class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        solve(ans,li,k,n,1);
        return ans;
    }
    public void solve(List<List<Integer>>ans,List<Integer>li,int k,int n,int i){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(n<0 || k<0 || i>9)return;
        li.add(i);
        solve(ans,li,k-1,n-i,i+1);
        li.remove(li.size()-1);
        solve(ans,li,k,n,i+1);
    }
}