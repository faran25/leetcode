class Solution {
    public int sq(int n)
    {
        int l=0;
        int r=n;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            long s=(long)mid*mid;
            if(s==n) return mid;
            if(s>n)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return r;
    }
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int x=sq(sum);
        return x*x==sum?x:-1;
    }
}
