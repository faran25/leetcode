class Solution {
    public boolean isPerfectSquare(int num) {
        
        int l=1,h=num;
    
    while(l<=h)
    {
       long mid = (l+h)/2;
        
        if(mid*mid==num)
            return true;
        else if(mid*mid<num)
            l = (int)mid+1;
        else
            h = (int)mid-1;
    }
    return false;
        
    }
}
