class Solution {
    public boolean isHappy(int n) {
        return solve(n,new HashSet<>());
    }
    public boolean solve(int n,Set<Integer>set){
        if(n==1)return true;
        if(set.contains(n))return false;
        set.add(n);
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=(temp*temp);
            n=n/10;
        }
        return solve(sum,set);
    }
}