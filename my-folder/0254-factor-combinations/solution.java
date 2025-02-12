class Solution {
    public void backtrack(List<List<Integer>> ans,List<Integer> list ,int n, int start)
    {
        if(n<2) {
            if(list.size()>1)
            {
                ans.add(new ArrayList<Integer>(list));
            }
            return;
        }
        for(int i=start;i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
                backtrack(ans,list,n/i,i);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),n,2);
        return ans;
    }
}
