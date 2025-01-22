class Solution {
    public int validSubarrays(int[] nums) {
        int ans=0;
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            int temp=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j]) break;
                temp++;
            }
            ans+=temp;
        }
        return ans;
        
    }
}
