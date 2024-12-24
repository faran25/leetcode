public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ans=0;

        for(int i=0;i<32;i++)
        {
            ans=ans<<1;
            int temp=(n>>i)&1;
            ans=ans|temp;
        }
        return ans;
    }
}

/* 
xor, and, or
>>, <<
10000010100101000001111010011100
01000000000000000000000000000000

*/
