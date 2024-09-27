class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int j=i+1;
            int temp=-1;
            while(j<nums.length && nums[j]<=num)
            {
                j++;
            }
            if(j==nums.length)
            {
                j=0;
                while(j<i && nums[j]<=num)
                {
                    j++;
                }
                if(nums[j]!=num)
                {
                    temp=nums[j];
                }
            }
            else
            {
                temp=nums[j];
            }
            ans[i]=temp;
        }
        return ans;
    }
}
