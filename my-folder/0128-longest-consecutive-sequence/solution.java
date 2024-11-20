class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1)) 
            {
                count=0;
                int num=nums[i];
                while(set.contains(num++))
                {
                    count++;
                }
                if(count>ans) ans=count;
            }
        }
        return ans;
    }
}
