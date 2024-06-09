class Solution {
    public int valueAfterKSeconds(int n, int k) {
        long ans=0;
        int [] dp= new int[n];
        Arrays.fill(dp,1);
        int count=1;
        while(count<=k)
        {
            long sum=1;
            
            for(int i=1;i<n;i++)
            {
                sum=sum+dp[i];
                sum=sum%(1000*1000*1000+7)*1l;
                dp[i]=(int)sum;
            }
            count++;
        }
        return dp[n-1];
    }
}
