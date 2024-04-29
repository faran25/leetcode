class Solution {
    public int myAtoi(String s) {
        long ans=0;
        s=s.trim().toLowerCase();
        boolean flag=false;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='-')
            {
                flag=true;
                i++;
                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    ans=ans*10+s.charAt(i)-'0';
                    if(ans>Integer.MAX_VALUE) return Integer.MIN_VALUE;
                    i++;
                }
                ans=ans*-1;
                if(ans<=(long)Integer.MIN_VALUE) 
                {
                    //System.out.println("check 1");
                    return Integer.MIN_VALUE;
                }
                return (int)(ans);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                ans=ans*10+s.charAt(i)-'0';
                if(ans>=Integer.MAX_VALUE) {
                //System.out.println("check 2");
                return Integer.MAX_VALUE;
                }
                i++;
            }
            if(ans>=Integer.MAX_VALUE) {
                //System.out.println("check 2");
                return Integer.MAX_VALUE;
                }
            return (int)(ans);
            }
            else if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)<'0' && s.charAt(i)!='+')
            || (s.charAt(i)=='+' && i+1<s.length() && (s.charAt(i+1)=='-' || s.charAt(i+1)=='+')))
            {
                //System.out.println("check 3");
                return 0;
            }
            i++;
        }
        if(flag) {
            //System.out.println("check 4");
            ans=ans*-1l;
            }
            //System.out.println("check 5");
        return (int)ans;
    }
}
