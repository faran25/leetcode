class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        float ans=100l;
        while(i<j)
        {
            float avg=(nums[i]+nums[j]);
            i++;
            j--;
            if(avg<ans)
            {
                ans=avg;
            }
        }
        return ans/2;
        
    }
}
