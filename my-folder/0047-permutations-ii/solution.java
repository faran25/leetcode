class Solution {
    List<Integer> curr=new ArrayList<>();
    HashSet<Integer> set=new HashSet<>();
    HashSet<List<Integer>> set2=new HashSet<>();

    public void uniquePermutations(int[] nums, List<List<Integer>> ans)
    {
        if(curr.size()==nums.length)
        {
            if(!set2.contains(curr)) 
            {
                set2.add(curr);
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(i)) continue;
            set.add(i);
            curr.add(nums[i]);
            uniquePermutations(nums,ans);
            set.remove(i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        uniquePermutations(nums,ans);
        return ans;
    }
}
