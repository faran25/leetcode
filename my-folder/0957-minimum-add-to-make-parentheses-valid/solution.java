class Solution {
    public int minAddToMakeValid(String s) {
        /*Stack<Character> st= new Stack<>();

        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push('(');
            }
            else if(st.size()==0)
            {
                ans++;
            } else if(st.peek()=='(')
            {
                st.pop();
            } else
            {
                ans++;
            }
        }
        ans=ans+st.size();
        return ans;
        */

        int ans=0;
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }else if(open==0)
            {
                ans++;
            } else
            {
                open--;
            }
        }
        return ans+open;
    }
}
