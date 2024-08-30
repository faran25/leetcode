class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans.add(i);
                i++;
                while(i<nums.length && nums[i]==target)
                {
                    ans.add(i);
                    i++;
                }
                return ans;
            }
        }
        return ans;
    }
}
