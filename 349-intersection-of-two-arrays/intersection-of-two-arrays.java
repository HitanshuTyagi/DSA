class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1=new HashSet<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int x:nums2){
            if(set.contains(x)){
                set1.add(x);
            }
        }
        int[] rs=new int[set1.size()];
        int i=0;
        for(int x:set1){
            rs[i]=x;
            i++;
        }
        return rs;
    }
}