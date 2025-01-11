class Solution {
    List<Integer> curr=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();

    public void permutations(int[] nums,List<List<Integer>> ans)
    {
        if(curr.size()==nums.length) 
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(i)) continue;
            set.add(i);
            curr.add(nums[i]);
            permutations(nums,ans);
            set.remove(i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums,ans);
        return ans;
    }
}
