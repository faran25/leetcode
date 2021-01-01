class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l=0;
        int r=nums.length-1;
        int mid=0;
        
        do{
            mid=(l+r)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }while (l<=r);
        
           return l;
        
        }
        
        /*int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;*/
        
    }

