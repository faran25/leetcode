class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums.length || nums[i]<0)
            {
                nums[i]=0;
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            nums[(nums[i]-1)%nums.length]=nums[(nums[i]-1)%nums.length]+2*nums.length;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]/(2*nums.length);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) return i+1;
        }
        return nums.length+1;
        
    }
}
