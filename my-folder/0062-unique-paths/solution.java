class Solution {
    public int uniquePaths(int A, int B) {
        int dp[]=new int[B];
        for(int i=0;i<B;i++)
        {
            dp[i]=1;
            
        }
        
        for(int i=1;i<A;i++)
        {
            for(int j=1;j<B;j++)
            {
                dp[j]=dp[j]+dp[j-1];
            }
        }
        
        return dp[B-1];
    }
}
