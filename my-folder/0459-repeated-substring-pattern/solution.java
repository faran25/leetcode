class Solution {
    public boolean repeatedSubstringPattern(String A) {
        
        int z[]=new int[A.length()];
        
        z[0]=0;
        int ans=A.length();
        for(int i=1;i<A.length();i++)
        {
            for(int j=0;i+j<A.length();j++)
            {
                if(A.charAt(i+j)==A.charAt(j))
                {
                    z[i]++;
                }
                else 
                {
                    break;
                }
            }
        }
        
        for(int i=1;i<A.length();i++)
        {
            if(z[i]+i==A.length())
            {
                if(A.length()%i==0)
                return true;
            }
        }
        return false;
        
    }
}
