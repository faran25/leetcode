class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[(nums[i]-1)%n]=nums[(nums[i]-1)%n]+2*n;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]/(2*n);
        }
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) list.add(i+1);
        }
        return list;
    }
}
