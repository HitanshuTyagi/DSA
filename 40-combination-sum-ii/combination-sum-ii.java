class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        Arrays.sort(candidates);
        solve(ans,li,candidates,target,0);
        return ans;
    }
    void solve(List<List<Integer>>ans,List<Integer>li,int[]arr,int target,int index){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }

            if(arr[i]>target)break;

            li.add(arr[i]);
            solve(ans,li,arr,target-arr[i],i+1);
            li.remove(li.size()-1);
        }
    }
}