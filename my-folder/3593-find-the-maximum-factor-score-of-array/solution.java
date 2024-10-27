class Solution {
    
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return a * (b / gcd(a,b));
    }

    public long maxScore(int[] nums) {
        if(nums.length==1) return nums[0]*nums[0];
        long lcm=nums[0];
        long gcd=nums[0];
        int n=nums.length;
        long[] pre=new long[n];
        long[] suf=new long[n];
        long[] lp=new long[n];
        long[] ls=new long[n];
        lp[0]=nums[0];
        ls[n-1]=nums[n-1]*1l;
        pre[0]=gcd;
        suf[n-1]=nums[n-1]*1l;
        long ans=0;
        for(int i=1;i<nums.length;i++)
        {
            gcd=gcd(gcd,nums[i]);
            lcm=lcm(lcm,nums[i]);
            pre[i]=gcd;
            lp[i]=lcm;
        }
        ans=lcm*gcd;
        long l=nums[n-1];
        gcd=nums[n-1];
        for(int i=n-1;i>=0;i--)
        {
            gcd=gcd(gcd,nums[i]);
            suf[i]=gcd;
            l=lcm(l,nums[i]);
            ls[i]=l;
        }
       for(int i=0;i<n;i++)
       {
            long hcf=0;
            l=0;
            if(i==0)
            {
                hcf=suf[1];
                l=ls[1];
            }
            else if(i==n-1)
            {
                hcf=pre[n-2];
                l=lp[n-2];
            }
            else
            {
                hcf=gcd(pre[i-1],suf[i+1]);
                l=lcm(lp[i-1],ls[i+1]);
            }
            if(hcf*l>ans)
            {
                ans=hcf*l;
            }
       }
        return ans;
    }
}
/*
16
2,2,2,2
2,4,8,16
*/
