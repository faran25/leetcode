class Solution {
    public int findMin(int[] nums) {
        int n=nums.length-1;
        if(n==0) return nums[0];
        /*if(nums[0]==nums[n/2] && nums[0]==nums[n])
        {
            int ans=nums[0];
            for(int i=1;i<=n;i++)
            {
                if(ans>nums[i]) ans=nums[i];
            }
            return ans;
        }*/
        int l=0;
        int r=n;
        int mid=(l+r)/2;

        while(l<r)
        {
            mid=(l+r)/2;
            if(nums[mid]>nums[r])
            {
                l=mid+1;
            }
            else if(nums[mid]<nums[r])
            {
                r=mid;
            }
            else
            {
                r--;
            }
        }
        return nums[l];
    }
}
