class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        int[] ans=new int[2];
        int sum=0;

        while(i<j)
        {
            sum=numbers[i]+numbers[j];
            if(sum==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
}
