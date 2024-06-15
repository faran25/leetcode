class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        int count=0;

        while(n>1)
        {
            if((n&1)==1) return false;
            n=n>>1;
        }
        return true;
    }
}
