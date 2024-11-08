class Solution {
    public int max(int num, int max)
    {
        if(num==0) return max;
        int k=1;
        while(num>0)
        {
            if((num&1)==1)
            {
                max=max^(k);
            }
            k=k<<1;
            num=num>>1;
        }
        return max;
    }
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max=0;
        while(maximumBit>0)
        {
            max=(max<<1)^1;
            maximumBit--;
        }
        int xor=0;
        int [] ans=new int[nums.length];
        int k=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
            ans[k--]=max-xor;
        }
        
        return ans;
    }
}/*
00 10
01 10
10 10
11 10
100 10
101 10
110 10
111 10
*/
