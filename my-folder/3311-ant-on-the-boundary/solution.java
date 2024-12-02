class Solution {
    public int returnToBoundaryCount(int[] nums) {
        if(nums.length==0 ) return 0;
        int count=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum==0) count++;
        }
        return count;
    }
}
