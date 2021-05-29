class Solution {
    public boolean checkZeroOnes(String s) {
        
        int count=0;
        int max1=0;
        int max2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            else
            {
                if(count>max1)
                {
                    max1=count;
                }
                count=0;
            }
        }
        if(count>max1) max1=count;
        max2=0;
        count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count++;
            }
            else
            {
                if(count>max2)
                max2=count;
                count=0;
            }
        }
        if(count>max2) max2=count;
        if(max1>max2) return true;
        else return false;
        
    }
}
