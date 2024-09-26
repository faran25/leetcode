class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long r=n;
        long mid=(l+r)/2;

        while(l<=r)
        {
            mid=l+(r-l)/2;
            long sum=mid*(mid+1)/2;
            if(n==sum) return (int)mid;
            if(n<sum)
            {
                r=mid-1;
            }else
            {
                l=mid+1;
            }
        }
        return (int)r;
    }
}
