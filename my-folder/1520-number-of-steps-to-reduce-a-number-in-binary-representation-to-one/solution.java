class Solution {
    private String addOne(String s)
    {
        int n=s.length()-1;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
            {

                {
                    String str=s.substring(0,i)+"1";
                    int j=i;
                    while(j<n)
                    {
                        str=str+"0";
                        j++;
                    }
                    return str;
                }
            }
        }
            String str="1";
            int i=0;
            while(i<=n)
            {
                str=str+"0";
                i++;
            }
            return str;
    }
    public int numSteps(String s) {
        
        int ans=0;
        while(s.length()!=1)
        {
            int n = s.length()-1;
            if(s.charAt(n)=='1')
            {
                s=addOne(s);
                ans++;
            }else
            {
                s=s.substring(0,n);
                ans++;
            }
        }
        return ans;
    }

}
