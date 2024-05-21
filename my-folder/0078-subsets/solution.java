class Solution {
    private void func(int[] nums, int n, List<List<Integer>> list)
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
        list.add(temp);
        func(nums,n+1,list);
    } 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        func(nums,1,list);
        return list;
    }
}
