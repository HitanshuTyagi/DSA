class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int num=1;
        int rowstart=0;
        int colstart=0;
        int rowend=n-1;
        int colend=n-1;
        int total=n*n;
        int cnt=0;
        while(cnt<total){
            for(int i=colstart;i<=colend && cnt<total;i++){
                arr[rowstart][i]=num;
                num++;
                cnt++;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend && cnt<total;i++){
                arr[i][colend]=num;
                num++;
                cnt++;
            }
            colend--;
            for(int i=colend;i>=colstart && cnt<total;i--){
                arr[rowend][i]=num;
                num++;
                cnt++;
            }
            rowend--;
            for(int i=rowend;i>=rowstart && cnt<total;i--){
                arr[i][colstart]=num;
                num++;
                cnt++;
            }
            colstart++;
        }
        return arr;
    }
}