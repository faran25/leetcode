class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[2*nums.length];
        int k=0;
        for(int j=0;j<2;j++)
        for(int i=0;i<nums.length;i++)
        {
            ans[k++]=nums[i];
        }
        return ans;
    }
}
