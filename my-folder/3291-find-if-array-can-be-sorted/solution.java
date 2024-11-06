class Solution {
    public int setBits(int n)
    {
        int ans=0;
        while(n>0)
        {
            if((n&1)==1)
                ans++;
            n=n>>1;
        }
        return ans;
    }
    public int [] sort(int[] nums, int start, int end)
    {
        int[] arr=new int[end-start+1];
        int k=0;
        for(int i=start;i<=end;i++)
        {
            arr[k]=nums[i];
            k++;
        }
        Arrays.sort(arr);
        k=0;
        for(int i=start;i<=end;i++)
        {
            nums[i]=arr[k];
            k++;
        }
        return nums;
    }
    public boolean canSortArray(int[] nums) {
        
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=setBits(nums[i]);
        }
        int k=0;
        for(int i=1;i<nums.length;i++)
        {
            if(arr[i-1]!=arr[i]) 
            {
                nums=sort(nums,k,i-1);
                k=i;
            }
        }
        nums=sort(nums,k,nums.length-1);
        //System.out.print(nums[0]+" ");
        for(int i=1;i<nums.length;i++)
        {
            //System.out.print(nums[i]+" ");
            if(nums[i-1]>nums[i]) return false;
        }
        return true;
    }
}
