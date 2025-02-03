class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int min=1;
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>prev) count++;
            else
            {
                max=Math.max(count,max);
                count=1;
            }
            max=Math.max(count,max);
            prev=nums[i];
        }
        count=1;
        prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<prev) count++;
            else
            {
                min=Math.max(count,min);
                count=1;
            }
            min=Math.max(count,min);
            prev=nums[i];
        }
        return (int)Math.max(max,min);
    }
}
