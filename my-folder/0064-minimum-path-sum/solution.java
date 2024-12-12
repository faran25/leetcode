class Solution {
    public int minPathSum(int[][] grid) {
        //Method 1, using extra space
        // we travelled from top to bottom, 
        //bottom to top is also acceptable and more intuitive for recursive soln

        /*int rows=grid.length;
        int col=grid[0].length;
        int [][] dp=new int[rows][col];
        dp[0][0]=grid[0][0];
        for(int i=1;i<col;i++)
        {
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }

        for(int i=1;i<rows;i++)
        {
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<col;j++)
            {
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[rows-1][col-1];
        */

        // Method 2, without using extra space, using the input matrix only
        // traversing from bottom to top in this approach

        int row=grid.length-1;
        int col=grid[0].length-1;

        for(int i=row-1;i>=0;i--)
        {
            grid[i][col]=grid[i][col]+grid[i+1][col];
        }

        for(int i=col-1;i>=0;i--)
        {
            grid[row][i]=grid[row][i]+grid[row][i+1];
        }

        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=0;j--)
            {
                grid[i][j]=grid[i][j]+Math.min(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];
    }
}
/**
1 3 1
1 5 1
4 2 1

1 4 5
2 7 6
6 8 7
 */
