class Solution {
    public int ways(int[] A, int B,int i,int sum)
    {
        if(i>=A.length) return 0;
        if(B<=0) return 1;
        if(B-A[i]>=0)
        sum+=ways(A,B-A[i],i+1,sum);
        return sum;
    }
    public int coinChange(int[] A, int B) {
        int max=B+1;
        int[] dp=new int[B+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int i=1;i<=B;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[j]<=i)
                {
                    dp[i]=Math.min(dp[i],dp[i-A[j]]+1);
                }
            }
        }
        if(dp[B]>B) return -1;
        return dp[B];
    }
}
