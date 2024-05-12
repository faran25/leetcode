class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][] ans=new int[grid.length-2][grid.length-2];
        for(int i=1;i<grid.length-1;i++)
        {
            for(int j=1;j<grid.length-1;j++)
            {
                ans[i-1][j-1]=findMax(grid,i,j);
            }
        }
        return ans;

    }
    private int findMax(int [][]grid, int i, int j )
    {
        int max=grid[i-1][j-1];

        for(int r=i-1;r<=i+1;r++)
        {
            for(int c=j-1;c<=j+1;c++)
            {
                if(max<grid[r][c]) max=grid[r][c];
            }
        }
        return max;
    }
}
