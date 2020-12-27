class Solution {
    public boolean isPalindrome(int x) {
        
        int k=0;
        if(x<0 || x%10==0 && x!=0)
        {
            return false;
        }
        else{
            //int l=x;
            while(k<x)
            {
                k=k*10+x%10;
                x=x/10;
            }
            if(k==x || x==k/10)
            {
                return true;
            }else{
                return false;
            }
        }
        
    }
}
