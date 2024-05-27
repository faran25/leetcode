class Solution {
    private int func(int i, int j, String A, String B, int[][] LCS)
    {
        if(i<0 || j<0) return 0;
        if(LCS[i][j]!=-1) return LCS[i][j];

        if(A.charAt(i)==B.charAt(j))
        {
            LCS[i][j]=1+func(i-1,j-1,A,B,LCS);
        }
        else
        {
            LCS[i][j]=Math.max(func(i-1,j,A,B,LCS),func(i,j-1,A,B,LCS));
        }
        return LCS[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] LCS=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        {
            for(int j=0;j<text2.length();j++)
            {
                LCS[i][j]=-1;
            }
        }
        return func(text1.length()-1,text2.length()-1,text1,text2,LCS);
        
    }
}
