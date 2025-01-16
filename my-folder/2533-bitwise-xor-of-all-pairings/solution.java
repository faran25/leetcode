class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1%2==0 && n2%2==0) return 0;
        int ans=0;
        if(n1%2==0)
        {
            for(int i=0;i<nums1.length;i++)
            {
                ans^=nums1[i];
            }
        }
        else if(n2%2==0){
            for(int i=0;i<nums2.length;i++)
            {
                ans^=nums2[i];
            }
        }
        else
        {
            for(int i=0;i<nums1.length;i++)
            {
                ans^=nums1[i];
            }
            for(int i=0;i<nums2.length;i++)
            {
                ans^=nums2[i];
            }
        }
    return ans;
    }
}
/*
1^3,1^4=
2^3,2^4
----
[1],[2,3]
1^2,1^3
*/

