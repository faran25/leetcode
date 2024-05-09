class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int count=0;
        int n=happiness.length;
        for(int i=n-1;i>=n-k;i--)
        {
            long temp=happiness[i]-count++;
            if(temp<=0)
            {
                return ans;
            }
            ans=ans+temp;
        }
        return ans;
    }
}
