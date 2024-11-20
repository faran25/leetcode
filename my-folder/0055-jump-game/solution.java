class Solution {
    public int jump(int[] nums, int step, int[] dp)
    {
        if(step+nums[step]>=nums.length-1)
        {
            return 1;
        }
        if(dp[step]!=-1) return dp[step];
        for(int i=step+1;i<=step+nums[step];i++)
        {
            if(jump(nums,i,dp)==1)
            {
                dp[step]=1;
                return 1;
            }
        }
        dp[step]=0;
        return 0;
    }
    public boolean canJump(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        if(jump(nums,0,dp)==0) return false;
        return true;
    }
}
/*
2,3,10,1,4
*/
