class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int pdt=1;
        boolean flag=false;
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(flag) return arr; //if it is second zero, then all elements of the array will be zero, because of 2 zeroes in the array.
                flag=true;
                index=i;
            } else
            pdt=pdt*nums[i];

        }
        if(flag)
        { //if there is one zero, all except one element will be zero
            arr[index]=pdt;
            return arr;
        }else
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=pdt/nums[i];
        }
        return arr;

    }
}
