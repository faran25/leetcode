class Solution {
    public int maxSubArray(int[] nums) {
        int max1=nums[0];
        int max2=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(max1>0)
            {
                max1=max1+nums[i];
            } else
            {
                max1=nums[i];
            }
            if(max1>max2) max2=max1;
        }
        return max2;
    }
}
