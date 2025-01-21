class Solution {
    /*private void func(int[] nums, int n, List<List<Integer>> list,HashSet<List<Integer>> set)
    {
        if(n>Math.pow(2,nums.length)) return;
        List<Integer> temp=new ArrayList<>();
        int k=1;
        int count=0;
        while(count<nums.length)
        {
            if((k&n)>=1)
            temp.add(nums[count]);
            k=k<<1;
            count++;
        }
        if(!set.contains(temp))
        {
            list.add(temp);
            set.add(temp);
        }
        func(nums,n+1,list,set);
    }*/
    public void backtrack(int[] nums, int index, List<Integer> list,HashSet<List<Integer>> set)
    {
        if(index==nums.length)
        {
            if(!set.contains(list))
            {
                set.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[index]);
        backtrack(nums,index+1,list,set);
        list.remove(list.size()-1);
        backtrack(nums,index+1,list,set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set= new HashSet<>();
        List<Integer> list=new ArrayList<>();
        backtrack(nums,0,list,set);
        for(List<Integer> value:set)
        {
            ans.add(new ArrayList<>(value));
        }
        return ans;
    }
}
