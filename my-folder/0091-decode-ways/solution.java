class Solution {
    public int numDecodings(String A) {
        if(A.charAt(0)=='0')return 0;
        if(A.length()==1) return 1;
        
        int a=1;
        int b=1;
        int c=1;
        int d=1;
        
        for(int i=1;i<A.length();i++)
        {
            if (A.charAt(i) == '0') 
            {    if(A.charAt(i-1)=='1' || A.charAt(i-1)=='2')
                {
                    d=b;
                }else return 0;
    		}
            else if(A.charAt(i-1)=='1')
            {
                d=c+b;
            }
            else if(A.charAt(i-1)=='2')
            {
                if(A.charAt(i)>'0' &&A.charAt(i)<'7') d=c+b;
                else d=c;
            }else 
            {
                d=c;
            }
            a=b;
            b=c;
            c=d;
                	
        }
        return d;
        
    }
}
