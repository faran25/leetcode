class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)< Math.abs(target-ans))
                {
                    ans=sum;
                }
                if(sum<target) j++;
                else if(sum>target) k--;
                else if(sum==target) return sum;
            }
        }
        return ans;
    }
}
