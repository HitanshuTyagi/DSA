class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[]arr=s.toCharArray();
        int ans=0;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            int l=left;
            int r=right;

            while(arr[l]!=arr[r]){
                r--;
            }

            if(l==r){
                ans+=arr.length/2-l;
            }
            else{
                for(int i=r;i<right;i++){
                    char temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    ans++;
                }
                right--;
            }
            left++;
        }
        return ans;
    }
}