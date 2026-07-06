class Solution {
    public int addDigits(int num) {
        return solve(num,new HashSet<>());
    }
    int solve(int n,Set<Integer>set){
        if(n<10)return n;
        if(set.contains(n))return 0;
        set.add(n);

        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
        }
        return solve(sum,set);
    }
}