class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x<=9) return true;
        int temp=x;
        int reversedNum=0;

        while(temp>0)
        {
            reversedNum=reversedNum*10+temp%10;
            temp=temp/10;
        }
        if(reversedNum==x) return true;
        return false;
    }
}
