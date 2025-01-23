class Solution {
    int [][] dp;
    public int backtrack(int m, int n)
    {
        if(m==1 || n==1) return 1;
        if(dp[m][n]>0) return dp[m][n];
        dp[m][n]=backtrack(m-1,n)+backtrack(m,n-1);
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        dp=new int[m+1][n+1];
        return backtrack(m,n);
    }
}
