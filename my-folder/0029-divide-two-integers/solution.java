class Solution {
    public int divide(int dividend, int divisor) {
        
        if((dividend >Math.pow(2,31)-1) || dividend<(-Math.pow(2,31)) || (divisor >Math.pow(2,31)-1) || divisor<(-Math.pow(2,31)))
            return (2147483647);
        
        else
        {
            /*int k=1;
            if(dividend/divisor<0)
            {
                k=-1;
            }*/
            int l=dividend/divisor;
            if(dividend==(-2147483648) && divisor==(-1))
              return 2147483647;
                else
            return l;
        }
        
    }
}
