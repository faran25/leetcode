class Solution {
    public void backtrack(int[] candidates,int sum, int target,int index,
    List<Integer> list, List<List<Integer>> ans)
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(list));
        }
        if(sum>target || index>=candidates.length || candidates[index]+sum>target) return;
        list.add(candidates[index]);
        backtrack(candidates,sum+candidates[index],target,index,list,ans);
        list.remove(list.size()-1);
        backtrack(candidates,sum,target,index+1,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,0,list,ans);
        return ans;
    }
}
