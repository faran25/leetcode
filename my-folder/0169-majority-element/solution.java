class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==maj) count++;
            else if(count==1) maj=nums[i];
            else count--;
        }
        return maj;
    }
}
