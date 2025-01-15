class Solution {
    public int gcd(int a,int b)
    {
        if(a==0 || b==0) return a+b;
        return gcd(b,a%b);
    }
    public int commonFactors(int a, int b) {
        int n=gcd(a,b);
        
        int i=2;
        int count=1;
        while(i<=n)
        {
            if(n%i==0) count++;
            i++;
        }
        return count;
    }
}
