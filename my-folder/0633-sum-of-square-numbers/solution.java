class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b = (long)Math.sqrt(c);
        while(a<=b)
        {
            long num=a*a+b*b;
            if(num==c) return true;
            else if(num<c) a++;
            else b--;
        }
        return false;
    }
}
