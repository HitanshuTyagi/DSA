class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int cnt=0;

        for(int top=0;top<n;top++){
            int[]colsum=new int[m];

            for(int bottom=top;bottom<n;bottom++){
                for(int c=0;c<m;c++){
                    colsum[c]+=matrix[bottom][c];
                }
                cnt+=solve(colsum,target);
            }
        }
        return cnt;
    }
    public int solve(int[]mat,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i];

            if(map.containsKey(sum-target)){
                cnt+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}