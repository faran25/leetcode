class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++)
        {
            if(check(mat,target))
            {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    public boolean check(int[][] mat, int[][] target)
    {
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate(int[][] matrix) {
        int r=matrix.length;

        for(int i=0;i<r;i++)
        {
            for (int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
            int l=0;
            r=matrix.length-l-1;
            while(l<r)
            {
            for(int i=0;i<matrix.length;i++)
            {
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
            }
            l++;
            r--;
            }
    }
}
