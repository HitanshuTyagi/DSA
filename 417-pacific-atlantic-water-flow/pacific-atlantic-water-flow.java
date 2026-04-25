class Solution {
    int[][]dir={{-1,0},{0,-1},{1,0},{0,1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        List<List<Integer>>res=new ArrayList<>();
        boolean[][]pacific=new boolean[n][m];
        boolean[][]atlantic=new boolean[n][m];

        for(int i=0;i<m;i++){
            solve(heights,pacific,0,i);
        }
        for(int i=0;i<n;i++){
            solve(heights,pacific,i,0);
        }
        for(int i=0;i<m;i++){
            solve(heights,atlantic,n-1,i);
        }
        for(int i=0;i<n;i++){
            solve(heights,atlantic,i,m-1);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void solve(int[][]heights,boolean[][]vis,int i,int j){
        vis[i][j]=true;

        for(int []d:dir){
            int x=i+d[0];
            int y=j+d[1];

            if(x>=0 && y>=0 && x<heights.length && y<heights[0].length && !vis[x][y] && heights[x][y]>=heights[i][j]){
                solve(heights,vis,x,y);
            }
        }     
    }
}