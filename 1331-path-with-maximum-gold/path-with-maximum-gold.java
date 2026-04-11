class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxgold=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    maxgold=Math.max(maxgold,solve(grid,i,j,n,m));
                }
            }
        }
        return maxgold;
    }
    public int solve(int[][]grid,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)return 0;

        int gold=grid[i][j];
        grid[i][j]=0;

        int max=0;
        max=Math.max(max,solve(grid,i+1,j,n,m));
        max=Math.max(max,solve(grid,i-1,j,n,m));
        max=Math.max(max,solve(grid,i,j+1,n,m));
        max=Math.max(max,solve(grid,i,j-1,n,m));

        grid[i][j]=gold;
        return max+gold;
    }
}