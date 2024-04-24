class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;

        while(l<r)
        {
            int w=r-l;
            int h=Math.min(height[l],height[r]); 
            if(w*h>ans) ans=w*h; //area=w*h
            if(height[l]>height[r]) r--;
            else if(height[l]<height[r]) l++;
            else
            {
                r--;
                l++;
            }
        }
        return ans;
    }
}
