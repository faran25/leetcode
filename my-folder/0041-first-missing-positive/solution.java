class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0 || nums[i]>n)
            {
                nums[i]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            nums[(nums[i]-1)%n]=nums[(nums[i]-1)%n]+2*n;
        }
        int count=1;
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]/(2*n);
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) return i+1;
        }
        return n+1;
    }
}
