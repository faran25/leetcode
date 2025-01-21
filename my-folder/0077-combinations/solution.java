class Solution {
    List<Integer> curr=new ArrayList<>();
    public void backtrack(int n, int count,int k,List<List<Integer>> ans)
    {
        //if(count>n || curr.size()>k) return;
        if(curr.size()==k)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        /*curr.add(count);
        backtrack(n,count+1,k,ans);
        curr.remove(curr.size()-1);
        backtrack(n,count+1,k,ans);
        */
        for(int i=count;i<=n;i++)
        {
            curr.add(i);
            backtrack(n,i+1,k,ans);
            curr.remove(curr.size()-1);
        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(n,1,k,ans);
        return ans;
    }
}
