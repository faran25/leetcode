class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                sum++;
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                }
                sum=0;
            }
        }
        if(sum>max) return sum;
        return max;
        
    }
}
