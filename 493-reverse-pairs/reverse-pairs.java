class Solution {
    int cnt=0;
    public int reversePairs(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return cnt;
    }
    public void mergeSort(int[]arr,int l,int r){
        if(l>=r)return;
        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        countPairs(arr,l,mid,r);
        merge(arr,l,mid,r);
    }
    public void merge(int[]arr,int l,int mid,int r){
        List<Integer>li=new ArrayList<>();
        int i=l;int j=mid+1;

        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                li.add(arr[i]);
                i++;
            }
            else{
                li.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            li.add(arr[i]);
            i++;
        }
        while(j<=r){
            li.add(arr[j]);
            j++;
        }
        for(int x=0;x<li.size();x++){
            arr[l+x]=li.get(x);
        }
    }
    void countPairs(int[]arr,int l,int mid,int r){
        int j=mid+1;
        for(int i=l;i<=mid;i++){
            while(j<=r && (long)arr[i]>2L*arr[j]){
                j++;
            }
            cnt+=j-(mid+1);
        }
    }
}
