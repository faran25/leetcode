class Solution {

    HashSet<Integer> col=new HashSet<>();
    HashSet<Integer> d1=new HashSet<>();
    HashSet<Integer> d2=new HashSet<>();
    public void convert(List<List<String>> ans, int[][] mat)
    {
        List<String> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]==0) sb.append(".");
                else sb.append("Q");
            }
            list.add(sb.toString());
        }
        ans.add(new ArrayList<>(list));
    }
    
    public void backtrack(List<List<String>> ans , int n, int[][] mat, int i)
    {
        if(n==0)
        {
            convert(ans,mat);
            return;
        }
            i=col.size();
            for(int j=0;j<mat.length;j++)
            {
                if(col.contains(j) || d1.contains(i-j) || d2.contains(i+j)) continue;
                col.add(j);
                d1.add(i-j);
                d2.add(i+j);
                mat[i][j]=1;
                backtrack(ans,n-1,mat,i+1);
                mat[i][j]=0;
                col.remove(j);
                d1.remove(i-j);
                d2.remove(i+j);
            }
    }
    public List<List<String>> solveNQueens(int n) {

        int[][] mat=new int [n][n];
        List<List<String>> ans=new ArrayList<>();
        if(n==2 || n==3) return ans;
        backtrack(ans,n,mat,0);
        return ans;
    }
}
/*
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
*/
