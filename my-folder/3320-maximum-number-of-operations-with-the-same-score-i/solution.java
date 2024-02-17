class Solution {
    public int maxOperations(int[] nums) {
        int ans=nums[0]+nums[1];
        int count=0;
        for(int i=0;i<nums.length-1;i=i+2)
        {
            
            int temp=nums[i]+nums[i+1];
            if(temp==ans) count++;
            else
            {
                break;
            }
        }
        return count;
    }
}
