class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1) return nums;

        if(k>=nums.length)
        {
            int max=nums[0];
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]>max) max=nums[i];
            }
            return new int[]{max};
        }

        Deque<Integer> dq=new ArrayDeque<>();
        int [] ans=new int[nums.length-k+1];

        for(int i=0;i<k;i++)
        {
            while(dq.size()>0 && nums[i]>dq.peekLast())
            {
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans[0]=dq.peek();
        for(int i=k;i<nums.length;i++)
        {
            if(nums[i-k]==dq.peek())
            {
                dq.removeFirst();
            }
            while(dq.size()>0 && nums[i]>dq.peekLast())
            {
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            ans[i-k+1]=dq.peek();
        }
        return ans;
    }
}
