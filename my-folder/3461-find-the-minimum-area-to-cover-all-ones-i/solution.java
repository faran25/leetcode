class Solution {
    public int minimumArea(int[][] grid) {
        
        int top=0;
        int bottom=grid.length;
        int left=0;
        int right=grid[0].length;
        boolean flag=false;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    top=i;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }

        flag=false;
        for(int i=grid.length-1;i>=0;i--)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    bottom=i;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        flag=false;
        for(int i=0;i<grid[0].length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i]==1)
                {
                    left=i;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        flag=false;
        for(int i=grid[0].length-1;i>=0;i--)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i]==1)
                {
                    right=i;
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        int breadth=right-left+1;
        int height=bottom-top+1;
        return breadth*height;
    }
}
