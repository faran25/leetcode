class Solution {
    PriorityQueue<Integer> pq;
    int k;
    public int add(int val) {
        if(pq.size()<k) pq.add(val);
        else if(pq.peek()<val)
        {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
    public int findKthLargest(int[] nums, int k) {
        this.k=k;
        pq=new PriorityQueue<>(k);
        for(int i=0;i<nums.length;i++)
        {
            add(nums[i]);
        }
        return pq.peek();
        
        /*
        Arrays.sort(nums);
        return nums[nums.length-k];
        */
    }
}
