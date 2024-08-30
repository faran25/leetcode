class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int []ans= new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(nums.length==0) return ans;
        int mid=0;
        boolean flag=false;
        if(nums[0]==target)
        {
            ans[0]=0;
            ans[1]=0;
            flag=true;
            if(nums[nums.length-1]==target)
            {
                ans[1]=nums.length-1;
                return ans;
            }
        }
        if(!flag)
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                if(nums[mid-1]==target)
                {
                    right=mid-1;
                }
                else
                {
                    flag=true;
                    ans[0]=mid;
                    ans[1]=mid;
                    break;
                }
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
        }
        if(!flag)
        {
            return new int[]{-1,-1};
        }
        left=ans[0];
        right=nums.length-1;
        if(nums[nums.length-1]==target)
        {
            ans[1]=nums.length-1;
            return ans;
        }
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                if(nums[mid+1]==target)
                {
                    left=mid+1;
                }
                else
                {
                    ans[1]=mid;
                    return ans;
                }
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
        }

        return ans;
    }
}
