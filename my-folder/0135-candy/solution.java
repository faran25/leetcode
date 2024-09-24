class Solution {
    public int candy(int[] nums) {
        int ans=1;
        int last=1;
        int num=0;
        int i=1;
        int peak=last;
        while(i<nums.length)
        {
            if(nums[i]>nums[i-1])
            {
                last++;
                peak=last;
                ans=ans+last;
                num=0;
            }
            else if(nums[i]==nums[i-1])
            {
                last=1;
                peak=last;
                num=0;
                ans=ans+last;
            }
            else
            {
                num++;
                ans=ans+num;
                last=1;
                // If the peak candy count is less than or equal to the decreasing sequence length,
                // we need to adjust by adding one extra candy to the peak (to ensure the condition)
                if (peak <= num) {
                ans++;
            }
            }
            i++;
        }
        return ans;
    }
}
