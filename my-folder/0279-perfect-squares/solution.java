class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            int num=(int)Math.sqrt(i);
            int min=i;
            for(int j=1;j<=num;j++)
            {
                if(min>dp[i-j*j]) min=dp[i-j*j];
            }
            dp[i]=1+min;
        }
        return dp[n];
    }
}
