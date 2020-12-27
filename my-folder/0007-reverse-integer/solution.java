class Solution {
    public int reverse(int x) {
        
        
        
        if(x<=-2147483648)
        {
            return 0;
        }
        else
        {
            long y=0;
        int k=1;
        if(x<0)
        {
            k=-1;
            x=x*k;
        }
        
                do{
                     y=y*10+x%10;
                     x=x/10;
                }while(x>0);
        if(k<0)
        {
            if(y>Math.pow(2,31)-1)
                y=0;
        }
            else
        {
            if(y>(Math.pow(2,31)-1))
            {
                y=0;
            }
        }
        y=y*k;
        return (int)y;
            }
    }
        
    }

