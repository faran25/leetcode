class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int ans=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        if(j==t.length()) return 0;
        else if(i==s.length())
        {
            ans=t.length()-j;
        }
        return ans;
        
    }
}
