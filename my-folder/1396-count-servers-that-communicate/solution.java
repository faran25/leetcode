class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            int index=-1;
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0) continue;
                if(index>=0)
                {
                    grid[i][j]=2;
                    flag=true;
                }else
                {
                    index=j;
                }
            }
            if(flag)
            {
                grid[i][index]=2;
            }
        }

        for(int i=0;i<m;i++)
        {
            boolean flag=false;
            int index=-1;
            for(int j=0;j<n;j++)
            {
                if(grid[j][i]==0) continue;
                if(index>=0)
                {
                    grid[j][i]=3;
                    flag=true;
                }else
                {
                    index=j;
                }
            }
            if(flag)
            {
                grid[index][i]=3;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]>1) ans++;
            }
        }
        return ans;
    }
}
