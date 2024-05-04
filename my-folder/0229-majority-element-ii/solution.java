class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max1=nums[0];
        int max2=Integer.MIN_VALUE;

        int count1=1;
        int count2=0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==max1) count1++;
            else if(nums[i]==max2) count2++;
            else if(count1==0) 
            {
                max1=nums[i];
                count1=1;
            }
            else if(count2==0) 
            {
                max2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }

        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max1==nums[i]) count1++;
            else if(max2==nums[i]) count2++;
        }
        List<Integer> list=new ArrayList<>();
        if(count1>nums.length/3) list.add(max1);
        if(count2>nums.length/3) list.add(max2);
        return list;
    }
}
