class Solution {
    public int sum(int num)
    {
        if(num<10) return num;
        return num%10+sum(num/10);
    }
    public int addDigits(int num) {
        
        while(num>9)
        {
            num=sum(num);
        }
        return num;
        //second approach
        /*
        if(num<10) return num;
        num=num%9;
        if(num==0) return 9;
        return num;
        */
    }
}
