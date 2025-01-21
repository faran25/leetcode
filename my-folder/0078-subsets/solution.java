class Solution {
    //int max=0;
    /*private void backtrack(int[] nums, int n, List<List<Integer>> list)
    {
        if(n>max) return; //max=(int)Math.pow(2,nums.length);
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
        backtrack(nums,n+1,list);
    }*/
    void backtrack(int[] nums,int index, List<List<Integer>> ans, List<Integer> list) 
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]); //do
        backtrack(nums,index+1,ans,list);
        list.remove(list.size()-1);//undo
        backtrack(nums,index+1,ans,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        //max=(int)Math.pow(2,nums.length);
        List<Integer> list=new ArrayList<>();
        backtrack(nums,0,ans,list);
        return ans;
    }
}
