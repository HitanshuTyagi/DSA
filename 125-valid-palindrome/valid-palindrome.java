class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        Stack<Character> st=new Stack<>();
        Queue<Character> q=new LinkedList<>();

        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(ch);
                q.add(ch);
            }
        }
        while(!st.isEmpty()){
            if(!st.pop().equals(q.poll())){
                return false;
            }
        }
        return true;
    }
}