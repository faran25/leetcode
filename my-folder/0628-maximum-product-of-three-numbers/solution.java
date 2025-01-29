class Solution {
    public int maximumProduct(int[] nums) {
        //Arrays.sort(nums);
        int a=nums[0];
        int b=Integer.MIN_VALUE;
        int c=Integer.MIN_VALUE;

        int x=a;
        int y=Integer.MAX_VALUE;
        int z=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=a)
            {
                c=b;
                b=a;
                a=nums[i];
            }
            else if(nums[i]>=b)
            {
                c=b;
                b=nums[i];
            }
            else if(nums[i]>c)
            {
                c=nums[i];
            }

            if(nums[i]<=x)
            {
                z=y;
                y=x;
                x=nums[i];
            }
            else if(nums[i]<=y)
            {
                z=y;
                y=nums[i];
            }
            else if(nums[i]<z)
            {
                z=nums[i];
            }
            
        }
        //System.out.println(a+" "+b+" "+c);
        int n=nums.length;
        int ans=a*b*c;
        if(x<0)
        {
            if(y<0)
            {
                int ans2=x*y*a;
                if(ans>ans2) return ans;
                return ans2;
            }
        }
        return ans;
        
    }
}
