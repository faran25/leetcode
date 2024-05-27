class Solution {

    int min(int a,int b)
    {
        a=a>b?b:a;
        return a;
    }
    private int func(int i,int j, String A,String B, int[][] LCS)
    {
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(LCS[i][j]!=-1) return LCS[i][j];
        if(A.charAt(i)==B.charAt(j))
        {
            LCS[i][j]=func(i-1,j-1,A,B,LCS);
        }
        else
        {
            LCS[i][j]=1+min(func(i,j-1,A,B,LCS),func(i-1,j,A,B,LCS));
        }
        return LCS[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int LCS[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                LCS[i][j]=-1;
            }
        }
        return func(n-1,m-1,word1,word2,LCS);
    }
}
