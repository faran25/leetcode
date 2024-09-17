class Solution {
    private int dfs(int i, int j, boolean[][] visited,int[][] A)
    {
        if(i<0 || j<0 || i>=A.length || j>=A[0].length || A[i][j]==0 || visited[i][j]==true)
        return 0;
        int area=1;
        visited[i][j]=true;
        area=area+dfs(i-1,j,visited,A);
        area=area+dfs(i,j-1,visited,A);
        area=area+dfs(i+1,j,visited,A);
        area=area+dfs(i,j+1,visited,A);
        return area;
    }
    public int maxAreaOfIsland(int[][] A) {
        boolean visited[][]=new boolean[A.length][A[0].length];
        int ans = 0;
        int area=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]==1 && !visited[i][j])
                {
                    area=dfs(i,j,visited,A);
                    if(area>ans) ans=area;
                }
            }
        }
        return ans;
    }
}
