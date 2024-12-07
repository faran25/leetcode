class Solution {
    public boolean canEatBananas(int[] piles, int h, int speed)
    {
        int ans=0;
        for(int i=0;i<piles.length;i++)
        {
            int k=piles[i]/speed;
            if(speed*k==piles[i]) ans+=k;
            else ans+=k+1;
        }
        if(ans<=h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++)
        {
            if(r<piles[i]) r=piles[i];
        }
        int mid=0;
        int ans=0;
        while(l<r)
        {
            mid=l+(r-l)/2; //mid==6;
            boolean flag=canEatBananas(piles,h,mid);
            if(flag)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}
