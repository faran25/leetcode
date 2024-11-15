class Solution {
    public int findPoisonedDuration(int[] nums, int duration) {
        
        int ans=duration;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+duration<nums[i])
            {
                ans+=duration;
            }else
            {
                ans+=nums[i]-nums[i-1];
            }
        }
        return ans;
    }
}
