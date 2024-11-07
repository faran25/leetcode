class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=10;
        if(n==1) return 10;
        dp[2]=91;

        int ans=1;
        for(int i=2;i<=n;i++)
        {
            int temp=9;
            int k=9;
            for(int j=1;j<i;j++)
            {
                temp=temp*k--;
            }
            dp[i]=dp[i-1]+temp;
        }
        return dp[n];
    }
}
