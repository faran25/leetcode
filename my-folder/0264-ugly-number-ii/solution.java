class Solution {
    private int min(int a,int b,int c)
    {
        if(a<b) 
        {
            if(a<=c) return a;
            else return c;
        }else
        {
            if(b<=c) return b;
            else return c;
        }
    }
    public int nthUglyNumber(int n) {
        int two=0;
        int three=0;
        int five=0;
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            dp[i]=min(2*dp[two],3*dp[three],5*dp[five]);
            if(dp[i]==2*dp[two])
            two++;
            if(dp[i]==3*dp[three])
            three++;
            if(dp[i]==5*dp[five])
            five++;
        }
        return dp[n-1];
    }
}
