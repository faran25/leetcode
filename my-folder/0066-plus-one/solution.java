class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9) 
        {
            digits[digits.length-1]++;
            return digits;
        }
        boolean flag=true;
        int i=digits.length-1;
        while(i>=0)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
                i--;
                while(i>=0)
                {
                    if(digits[i]==9)
                    {
                        digits[i--]=0;
                    }
                    else
                    {
                        digits[i]++;
                        return digits;
                    }
                }
                if(i==-1)
                {
                    int []ans = new int[digits.length+1];
                    ans[0]=1;
                    for(i=1;i<=digits.length;i++)
                    {
                        ans[i]=0;
                    }
                    return ans;
                }
            }
            i--;
        }
        return digits;
    }
}
