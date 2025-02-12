class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        int n=nums.length;
        int [][] dp=new int[n+1][1+(sum/2)];
        for(int j=0;j<=sum/2;j++)
        {
            if(j>=nums[0])
            {
                dp[0][j]=nums[0];
            }
        }
        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=sum/2;j++)
            {
                if(j>=nums[i])
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i]]+nums[i]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
                //if(dp[i][j]==sum/2) return true;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(dp[i][sum/2]==sum/2) return true;
        }
        return false;
    }
}

