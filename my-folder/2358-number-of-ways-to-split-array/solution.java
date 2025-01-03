class Solution {
    public int waysToSplitArray(int[] nums) {
        long post=0;
        for(int i=0;i<nums.length;i++)
        {
            post+=nums[i];
        }
        int ans=0;

        long sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum+=nums[i];
            post-=nums[i];
            if(sum>=post) ans++;
        }
        return ans;
    }
}
