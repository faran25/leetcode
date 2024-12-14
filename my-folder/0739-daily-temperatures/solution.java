class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] dp=new int[n];
        dp[n-1]=0;

        for(int i=n-2;i>=0;i--)
        {
            int count=0;
            int j=i+1;
            while(j<n)
            {
                if(temperatures[i]==temperatures[j])
                {
                    if(dp[j]==0)
                    {
                        dp[i]=0;
                        break;
                    }
                    dp[i]=dp[j]+j-i;
                    break;
                }
                if(temperatures[i]>temperatures[j])
                {
                    count++;
                }
                else
                {
                    dp[i]=count+1;
                    break;
                }
                j++;
            }
            if(j==n) dp[i]=0;
            
        }
        return dp;

    }
}
