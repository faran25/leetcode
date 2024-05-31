class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;

        for(int i=32;i>=0;i--)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(((nums[j]>>i)&(1))==1) count++;
            }
            count=count%3;
            ans=(ans)|((count)<<i);
        }
        return ans;
    }
}
