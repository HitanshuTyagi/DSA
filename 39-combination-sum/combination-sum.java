class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        solve(li,ans,candidates,target,0);
        return ans;
    }
    void solve(List<Integer>li,List<List<Integer>>ans,int[]arr,int target,int i){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(target<0 || i==arr.length)return;
        li.add(arr[i]);
        solve(li,ans,arr,target-arr[i],i);
        li.remove(li.size()-1);
        solve(li,ans,arr,target,i+1);
    }
}