class Solution {
    public int[] reverse(int[] nums)
    {
        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
    public int[] decrypt(int[] nums, int k) {
        if(k==0)
        {
            Arrays.fill(nums,0);
            return nums;
        }
        boolean flag=false;
        if(k<0)
        {
            //reversing it if negative, again reversing it in the end to correct it.
            nums=reverse(nums);
            flag=true;
            k*=-1;
        }

        int [] pre=new int[nums.length];
        int n=nums.length;
        int sum=0;
        for(int i=1;i<=k;i++)
        {
            sum+=nums[i];
        }
        int i=1;
        int j=k+1;
        int count=0;
        while(count<n)
        {
            pre[(i-1)%n]=sum;
            sum=sum-nums[i%n]+nums[j%n];
            i++;
            j++;
            count++;
        }
        if(flag)
        {
            pre=reverse(pre);
        }
        return pre;
    }
}
