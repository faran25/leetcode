class Solution {
    public int findMin(int[] nums) {
        int n=nums.length-1;
        int l=0;
        int r=nums.length-1;
        int mid=(r+l)/2;
        while(l<r)
        {
            mid=(l+r)/2;
            if(nums[mid]<nums[n])
            {
                r=mid;
            }else
            {
                l=mid+1;
            }
        }
        return nums[l];
    }
}
