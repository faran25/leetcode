class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int ans=-1;
        
        for(int i=0;i<s.length();i++)
        {
            int k=s.charAt(i)-'0';
            if(k<10)
            {
                if(k>max)
                {
                    ans=max;
                    max=k;
                }
                else if(k==max)
                {
                    continue;
                }
                else if(k>ans)
                {
                    ans=k;
                }
                //if(ans==8) return 8;
            }
        }
        return ans;
        
    }
}
