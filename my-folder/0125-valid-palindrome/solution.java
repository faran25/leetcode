class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder str=new StringBuilder(s.toLowerCase());
        //str=s.toLowerCase();
        while(l<r)
        {
            if(((str.charAt(l)>='a' && str.charAt(l)<='z')|| (str.charAt(l)>='0' && str.charAt(l)<='9')) 
            && ((str.charAt(r)>='a' && str.charAt(r)<='z')|| (str.charAt(r)>='0' && str.charAt(r)<='9')))
            {
                if(str.charAt(l)!=str.charAt(r))
                return false;
                else 
                {
                    l++;
                    r--;
                }
            }
            else if(!((str.charAt(l)>='a' && str.charAt(l)<='z')|| (str.charAt(l)>='0' && str.charAt(l)<='9')))
            {
                l++;
            } 
            else if(!((str.charAt(r)>='a' && str.charAt(r)<='z')|| (str.charAt(r)>='0' && str.charAt(r)<='9')))
            {
                r--;
            }
            else 
            {
                return false;
            }
        }
        return true;

    }
}
