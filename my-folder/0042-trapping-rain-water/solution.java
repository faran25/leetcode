class Solution {
    public int trap(int[] height) {
        int index=0;
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>max) {
                max=height[i];
                index=i;
                }
        }
        int ans=0;
        int mm=height[0];
        for(int i=1;i<index;i++)
        {
            if(mm>height[i])
            {
            ans=ans+mm-height[i];
            }
            else
            mm=height[i];

        }
        mm=height[height.length-1];
        for(int i=height.length-2;i>index;i--)
        {
            if(mm>height[i])
            {
            ans=ans+mm-height[i];
            }
            else
            mm=height[i];

        }
        return ans;
    }
}
