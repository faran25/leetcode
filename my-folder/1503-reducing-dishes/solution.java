class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum=0;
        int ans=0;
        for(int i=satisfaction.length-1;i>=0;i--)
        {
            if(satisfaction[i]+sum>0)
            {
                sum=sum+satisfaction[i];
                ans=ans+sum;
            }
        }
        return ans;
    }
}
