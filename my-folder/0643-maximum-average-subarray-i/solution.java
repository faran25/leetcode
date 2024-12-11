class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        long max=sum;

        int l=0;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[l++];
            if(sum>max) max=sum;
        }

        double ans=(double)max/k;
        return ans;
    }
}
