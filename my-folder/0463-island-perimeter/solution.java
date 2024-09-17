class Solution {
    int ans=0;
    
    private int dfs(int i, int j, boolean[][] visited,int[][] A)
    {
        if(i<0 || j<0 || i>=A.length || j>=A[0].length || A[i][j]==0)
        return 1;
        if(visited[i][j]==true) return 0;
        int count=0;
        visited[i][j]=true;
        count=count+dfs(i-1,j,visited,A);
        count=count+dfs(i,j-1,visited,A);
        count=count+dfs(i+1,j,visited,A);
        count=count+dfs(i,j+1,visited,A);
        return count;
    }
    public int islandPerimeter(int[][] A) {
        boolean visited[][]=new boolean[A.length][A[0].length];
        int ans = 0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]==1 && !visited[i][j])
                {
                    ans=dfs(i,j,visited,A);
                    break;
                }
            }
        }
        return ans;
    }
}
