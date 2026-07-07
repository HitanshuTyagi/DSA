class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }
            else{
                int num=Math.abs(arr[i]);
                while(!st.isEmpty() && st.peek()>0 && st.peek()<num){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==num){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(arr[i]);
                }
            }   
        }
        int[]nums=new int[st.size()];
        int i=0;
        for(int x:st){
            nums[i]=x;
            i++;
        }
        return nums;
    }
}