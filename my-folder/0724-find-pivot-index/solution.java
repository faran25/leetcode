class Solution {
    public int pivotIndex(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }

        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum-nums[i];
            if(sum==curr) return i;
            curr=curr+nums[i];
        }
        return -1;
        
    }
}
