class Solution {
    HashSet<Integer> col=new HashSet<>();
    HashSet<Integer> d1=new HashSet<>();
    HashSet<Integer> d2=new HashSet<>();
    int ans=0;
    public void backtrack(int n, int m)
    {
        if(n==0)
        {
            ans++;
            return;
        }
            int i=col.size();
            for(int j=0;j<m;j++)
            {
                if(col.contains(j) || d1.contains(i-j) || d2.contains(i+j)) continue;
                col.add(j);
                d1.add(i-j);
                d2.add(i+j);
                backtrack(n-1,m);
                col.remove(j);
                d1.remove(i-j);
                d2.remove(i+j);
            }
    }
    public int totalNQueens(int n) {
        if(n==1) return n;
        if(n==2||n==3) return 0;
        backtrack(n,n);
        return ans;
    }
}
