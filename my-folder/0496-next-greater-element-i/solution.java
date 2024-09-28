class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
        {
            int num=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==num)
                {
                    int temp=-1;
                    while(j<nums2.length && nums2[j]<=num)
                    {
                        j++;
                    }
                    if(j<nums2.length) temp=nums2[j];
                    ans[i]=temp;
                    break;
                }
            }
        }
        return ans;
    }
}
