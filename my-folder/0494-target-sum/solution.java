class Solution {
    int ans=0;
    public void dp(int[] nums, int index, int target,int sum)
    {
        if(index>=nums.length) {
            if(sum==target) ans++;
            return ;   
        }

        dp(nums,index+1,target,sum+nums[index]);
        dp(nums,index+1,target,sum-nums[index]);

    }
    public int findTargetSumWays(int[] nums, int target) {
        dp(nums,0,target,0);
        return ans;
    }
}
