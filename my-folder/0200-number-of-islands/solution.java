class Solution {
    private boolean isInvalid(int i, int j, boolean[][] visited,char[][] grid)
    {
        if((i<0 || i>=grid.length) || (j<0 || j>=grid[0].length) 
        || (grid[i][j]=='0') || (visited[i][j])) return true;
        return false;
    }
    private void dfs(int i, int j, boolean[][] visited,char[][] grid)
    {
        if(isInvalid(i,j,visited,grid)) return;
        visited[i][j]=true;
        dfs(i-1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i+1,j,visited,grid);
        dfs(i,j-1,visited,grid);

    }
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int islands=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    islands++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return islands;
    }
}
