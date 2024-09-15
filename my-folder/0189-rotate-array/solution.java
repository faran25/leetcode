class Solution {
    public void func(int[] nums, int l, int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length-1;
        func(nums,0,n);
        func(nums,0,k-1);
        func(nums,k,n);
    }
}
