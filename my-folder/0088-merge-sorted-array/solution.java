class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        /*for(int i=0;i<n;i++)
        {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);*/
        
       // int []a=new int[m+n];
        int k=m-1;
        int l=n-1;
        int i=m+n-1;
        
        while(k>=0 && l>=0)
        {
            if(nums1[k]>nums2[l])
            {
                nums1[i]=nums1[k];
                    k--;
            }
                
            else
            {
                nums1[i]=nums2[l];
                l--;
                
            }
            i--;
            
        }
        
        while(l>=0)
        {
            nums1[i]=nums2[l];
            i--;
            l--;
        }
        
        
        
    }
}
