class Solution {
    
    public void func(HashSet<String> set, char [] arr, int index, List<String> list)
    {
        if(index==arr.length)
        {
            if(!set.contains(String.valueOf(arr)))
            {
                list.add(String.valueOf(arr));
            }
            return;
        }
        if(list.size()>0) return;
        // base case

        // do
        arr[index]='1';
        func(set,arr,index+1,list);
        // undo
        arr[index]='0';
        func(set,arr,index+1,list);
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int n=nums.length;
        char [] arr=new char[n];
        Arrays.fill(arr,'0');
        List<String> list=new ArrayList<>();
        func(set,arr,0,list);
        return list.get(0);
    }
}
