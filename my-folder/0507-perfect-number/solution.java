class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<2 || num%2 != 0) return false;
        int sum=1;
        int max=(int)Math.sqrt(num);
        for(int i=2;i<=max;i++)
        {
            if(num%i==0) {
                sum += i;
                int oth=num/i;
                if(i!=oth)
                sum +=num/i;
            }
        }
        return sum==num;
    }
}
