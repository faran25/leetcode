class Solution {
    public void set(int[][] matrix,int row, int col,int k)
    {
        for(int i=0;i<matrix[row].length;i++)
        {
            if(matrix[row][i]!=0)
            {
                matrix[row][i]=k; ///hoped that -1010 wasnt in any test cases.
            } 
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][col]!=0)
            {
                matrix[i][col]=k;
            } 
        }
    }
    public void setZeroes(int[][] matrix) {
        int k=-1;
        boolean flag=true;
        for(int num=-1;num>=-1000000;num--)
        {
            if(!flag) {
                k=num+1;
                break;
            }
            flag=false;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==num)
                {
                    flag=true;
                    break;
                }
            }
        }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                set(matrix,i,j,k);
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==k)
                matrix[i][j]=0;
            }
        }
    }
}
