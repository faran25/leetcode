class Solution {
    private int func(int n, int[] dp)
    {
        if(dp[n]!=-1) return dp[n];

        if(n%2==0) dp[n]=func(n/2,dp);
        else
        dp[n]=1+func(n/2,dp);
        return dp[n];
    }
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        if(n==0) return dp;
        //dp[n]=func(n,dp);
        for(int i = 1; i <= n; i++) {
            func(i, dp);
        }
        return dp;
    }
}
