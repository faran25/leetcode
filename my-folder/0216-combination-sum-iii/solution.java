class Solution {

    List<Integer> curr=new ArrayList<>();
    public void backtrack(int n, int count,int k,int sum,List<List<Integer>> ans)
    {  
        if(sum>n) return;
        if(curr.size()==k)
        {
            if(sum==n)
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=count;i<=9;i++)
        {
            if(sum+i<=n){
            curr.add(i);
            backtrack(n,i+1,k,sum+i,ans);
            curr.remove(curr.size()-1);
            } else break;
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(n,1,k,0,ans);
        return ans;
    }
}
