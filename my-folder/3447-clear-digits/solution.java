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
        String ans="";
        
        while(st.size()>0)
        {
            ans=st.pop()+""+ans;
        }
        return ans;
        
    }
}
