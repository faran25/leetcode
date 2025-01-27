class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean [][] dp=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                {
                    dp[i][j]=true;
                }
            }
        }
        int[] cuts=new int[n];
        Arrays.fill(cuts,n-1);
        for(int i=0;i<n;i++)
        {
            if(dp[0][i])
            {
                cuts[i]=0;
                continue;
            }
            int min=i;
            for(int j=i-1;j>=0;j--)
            {
                ////if(k+1,i) is pallindrome, ans would be cuts[j+1-1] i.e cuts[j]+1.
                //ans we have to find the minimum here.
                if(dp[j+1][i]) 
                {
                    min=Math.min(cuts[j]+1,min);
                }
            }
            cuts[i]=min;
        }
        return cuts[n-1];
    }
}
