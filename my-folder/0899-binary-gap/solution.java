class Solution {
    public int binaryGap(int n) {
        
        int index=-1;
        int ans=0;
        for(int i=0;i< 32;i++)
        {
            if((n & 1)>0) {
                if(index >= 0 && ans<i-index)
                {
                    ans=i-index;
                }
                index=i;
            }
            n=n>>1;
        }
        return ans;
    }
}

