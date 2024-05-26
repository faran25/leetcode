class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length+1;
        int [] dp=new int[n];
        dp[0]=1;
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
            int len=0;
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i] && len<dp[j])
                {
                    len=dp[j];
                }
            }
            dp[i]=1+len;
            if(max<dp[i]) max=dp[i];
        }
        return max;
    }
}
