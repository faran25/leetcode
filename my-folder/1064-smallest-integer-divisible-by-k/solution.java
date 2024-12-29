import java.math.BigInteger;
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int len=1;
        int num=1;
        while(len<=k)
        {
            num=num%k;
            if(num==0)
            {
                return len;
            }
            len++;
            num=num*10+1;
        }
        return -1;

    }
}
