class Solution {
    private long sum(long n)
    {
        if(n*n<10) return n*n;

        long ans=0;
        while(n>0)
        {
            ans=ans+(n%10)*(n%10);
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {

        long num=n;

        while(num>3)
        {
            num=sum(num);
            if(num==1 || num==10 || num==100 || num==1000) {
                System.out.println ("num= "+num+" "+n);
                return true;}
            if(num==89) {
                System.out.println ("num= "+num+" "+n);
                return false;}
        }
        if(num==1 || num==10 || num==100 || num==1000) return true;
        return false;

    }

}
