class Solution {
    public boolean check(int[] nums, int i,int j)
    {
        int prev=nums[i];
        while(i+1<=j)
        {
            if((nums[i+1]-prev)!=1)
            {
                return false;
            }
            prev=nums[i+1];
            i++;
        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++)
        {
            if(check(nums,i,i+k-1))
            {
                ans[i]=nums[i+k-1];
            }
            else
            {
                ans[i]=-1;
            }
        }
        return ans;
    }
}
