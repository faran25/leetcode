class Solution {
    public int longestPalindrome(String s) {
        int[] l= new int[26];
        int[] u=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<='Z')
            {
                l[s.charAt(i)-'A']++;
            }
            else
            {
                u[s.charAt(i)-'a']++;
            }
        }
        boolean flag=false;
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(l[i]%2==0 && l[i]!=0)
            {
                ans=ans+l[i];
            } else if(l[i]>=1)
            {
                ans=ans+l[i]-1;
                flag=true;
            }
            if(u[i]%2==0 && u[i]!=0)
            {
                ans=ans+u[i];
            } else if(u[i]>=1)
            {
                ans=ans+u[i]-1;
                flag=true;
            }
        }
        if(flag) return ans+1;
        return ans;
        
    }
}
