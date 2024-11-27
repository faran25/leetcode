class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray())
        {
            if(ch!='#' ) st.push(ch);
            else if(st.size()>0) st.pop();
        }
        s=st.toString();
        st.clear();
        for(char ch:t.toCharArray())
        {
            if(ch!='#' ) st.push(ch);
            else if(st.size()>0) st.pop();
        }
        if(s.equals(st.toString())) return true;
        return false;

    }
}
