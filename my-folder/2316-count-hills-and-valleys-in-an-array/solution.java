class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int j=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[j]>nums[i] && nums[i]<nums[i+1] )
            {
                count++;
                j=i;
            }
            else if(nums[j]<nums[i] && nums[i]>nums[i+1] )
            {
                count++;
                j=i;
            }
        }
        return count;
    }
}
//6,5,4,1
