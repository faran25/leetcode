class Solution {
    /*private int func(int n, int[] dp)
    {
        if(n==0) return 0;
        if(dp[n]>0) return dp[n];

        if(n%2==1) dp[n]=1+func(n/2,dp);
        else
        dp[n]=func(n/2,dp);
        return dp[n];
    }*/
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        if(n==0) return dp;
        dp[1]=1;
        if(n==1) return dp;
        ///dp[n]=func(n,dp);

        for(int i=2;i<=n;i++)
        {
            if((i&1)==0) 
                dp[i]=dp[i/2];
            else 
                dp[i]=1+dp[i/2];
        }
        return dp;
    }
}
