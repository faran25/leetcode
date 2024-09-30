class Solution {
    public int distributeCandies(int[] nums) {
        HashSet set = new HashSet<>();
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        count=set.size();
        if(2*count>=n) return n/2;
        return count;
    }
}
