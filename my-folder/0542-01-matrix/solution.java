class Solution {
    //solved using dp
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0) continue;
                int top=m+n;
                int left=m+n;
                if(i-1>=0) top=mat[i-1][j];
                if(j-1>=0) left=mat[i][j-1];
                mat[i][j]=Math.min(top,left)+1;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(mat[i][j]==0) continue;
                int bottom=m+n;
                int right=m+n;
                if(i+1<n) bottom=mat[i+1][j];
                if(j+1<m) right=mat[i][j+1];
                mat[i][j]=Math.min(mat[i][j],Math.min(bottom,right)+1);
            }
        }
        return mat;
    }
}
