class Solution {
    public boolean func(String s, String p, int i, int j)
    {
        if(i<0 && j<0) return true;
        if(i<0 && j>-1 && p.charAt(j)=='*')
        {
            return func(s,p,i,j-1);
        }
        if(i<0 || j<0) return false;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        {
            return func(s,p,i-1,j-1);
        }
        boolean flag=false;
        if(p.charAt(j)=='*')
        {
            
            for(;i>=-1;i--)
            {
                flag|=func(s,p,i,j-1);
                if(flag) return true;
            }
        }
        return flag;  
    }
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean dp[] = new boolean[m+1];
        dp[0]=true;
        for(int i=1;i<=m;i++)
        {
            if(dp[i-1] && p.charAt(i-1)=='*')
            {
                dp[i]=true;
            }
        }
        
        for(int i=1;i<=n;i++)
        {
            boolean []curr=new boolean[m+1];
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
                {
                    curr[j]=dp[j-1];
                }
                else if(p.charAt(j-1)=='*')
                {
                    curr[j]=curr[j-1] | dp[j];
                }
            }
            for(int j=0;j<=m;j++)
            {
                dp[j]=curr[j];
            }
        }
        
        return dp[m];
    }
}
