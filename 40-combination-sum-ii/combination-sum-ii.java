class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>li=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(li,ans,candidates,0,target);
        return ans;
    }
    public void solve(List<Integer>li,List<List<Integer>>ans,int[]arr,int index,int target){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            li.add(arr[i]);
            solve(li,ans,arr,i+1,target-arr[i]);
            li.remove(li.size()-1);
        }
    }
}