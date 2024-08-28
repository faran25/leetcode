class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;

        while(i>=2)
        {
            int a=nums[i];
            int b=nums[i-1];
            int c=nums[i-2];
            if(b+c>a)
            {
                return a+b+c;
            }
            i--;
        }
        return 0;
    }
}
