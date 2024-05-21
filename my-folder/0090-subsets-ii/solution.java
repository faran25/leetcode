class Solution {
    private void func(int[] nums, int n, List<List<Integer>> list,HashSet<List<Integer>> set)
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
    } 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set= new HashSet<>();
        func(nums,1,list,set);
        return list;
    }
}
