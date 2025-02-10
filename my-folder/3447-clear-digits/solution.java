class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' &&s.charAt(i)<='9')
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        
        while(st.size()>0)
        {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
        
    }
}
