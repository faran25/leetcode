class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max) max=nums[i];
        }

        int ans=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                count++;
                if(count>ans) ans=count;
            }
            else
            {
                count=0;
            }
        }
        return ans;
    }
}
