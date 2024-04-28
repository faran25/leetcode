class Solution {
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
