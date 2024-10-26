class Solution {
    public int rob(int[] A) {
        if(A.length==1) return A[0];
        int dp[]=new int[A.length];
        dp[0]=A[0];
        dp[1]=A[1];
        if(A.length==2) return Math.max(dp[0],dp[1]);
        if(A.length==3) return Math.max(Math.max(A[0],A[1]),A[2]);
        if(A.length==4) return Math.max(A[0]+A[2],A[1]+A[3]);
        dp[2]=Math.max(A[2]+dp[0],dp[1]);
        
        int max=Math.max(dp[0],dp[1]);
        max=Math.max(max,dp[2]);
        for(int i=3;i<A.length-1;i++)
        {
            int temp=Math.max(A[i]+dp[i-2],A[i]+dp[i-3]);
            dp[i]=Math.max(temp,dp[i-1]);
            if(dp[i]>max)max=dp[i];
        }
        dp[0]=A[1];
        dp[1]=A[2];
        dp[2]=Math.max(A[3]+dp[0],dp[1]);
        for(int i=4;i<A.length;i++)
        {
            int temp=Math.max(A[i]+dp[i-3],A[i]+dp[i-4]);
            dp[i-1]=Math.max(temp,dp[i-2]);
            if(dp[i-1]>max)max=dp[i-1];
        }

        return max;
    }
}
