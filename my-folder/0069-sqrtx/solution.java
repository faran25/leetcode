class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int r=x;
        int l=0;
        int mid=0;

        while(l<=r)
        {
            mid=(l+r)/2;
            if(mid==x/mid)
            {
                return mid;
            }
            else if(mid<x/mid)
            {
                l=mid+1;
            } 
            else
            {
                r=mid-1;
            }
        }
        return r;
    }
}
