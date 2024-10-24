class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (s1, s2) -> {
            if(s1.length()>s2.length())
            {
                return 1;
            }
            else if(s1.length()<s2.length())
            {
                return -1;
            } 
            else
            {
                return s1.compareTo(s2);
            }

        });
        
        /*for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }*/
        return nums[nums.length-k];
        
    }
}
