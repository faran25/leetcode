class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();
        if(n==0) return "";
        boolean[][] dp=new boolean[n][n];
        int st=0;
        int en=0;
        int l=0;
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
            st=i;
            en=i+1;
            l=1;
        }

        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                st=i;
                en=i+2;
                l=2;
            }
        }

        for(int len=3;len<=n;len++)
        {
            for(int i=0;i<n-len+1;i++)
            {
                if(s.charAt(i)==s.charAt(i+len-1) && dp[i+1][i+len-2])
                {
                    dp[i][i+len-1]=true;
                    if(len>l)
                    {
                        l=len;
                        st=i;
                        en=i+len;
                    }
                }
            }
        }
        return s.substring(st,en);
    }
}
