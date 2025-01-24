class Solution {
    public int[][] highestPeak(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    grid[i][j]=0;
                }
                else
                {
                    grid[i][j]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                int top=m+n;
                int left=m+n;
                if(i-1>=0) top=grid[i-1][j];
                if(j-1>=0) left=grid[i][j-1];
                grid[i][j]=Math.min(top,left)+1;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(grid[i][j]==0) continue;
                int bottom=m+n;
                int right=m+n;
                if(i+1<n) bottom=grid[i+1][j];
                if(j+1<m) right=grid[i][j+1];
                grid[i][j]=Math.min(grid[i][j],Math.min(bottom,right)+1);
            }
        }
        return grid;

    }
}
