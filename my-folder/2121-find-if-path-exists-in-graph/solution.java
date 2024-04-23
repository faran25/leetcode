class Solution {

    private void dfs(int v, boolean[] vis, ArrayList<ArrayList<Integer>> adj,int dest)
    {
        vis[v]=true;

        for(int neighbour:adj.get(v))
        {
            if(neighbour==dest)
            {
                vis[dest]=true;
                break;
            }
            else if(!vis[neighbour])
            {
                dfs(neighbour,vis,adj,dest);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<edges.length;i++)
        {
            int from=edges[i][0];
            int to=edges[i][1];
            adj.get(from).add(to);
            adj.get(to).add(from);
        }
        dfs(source,vis,adj,destination);
        if(vis[destination])
        {
            return true;
        }
        return false;
    }
}
