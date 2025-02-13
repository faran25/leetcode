class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(a, b));
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]*1l);
        }

        while(pq.peek()<k && pq.size()>=2)
        {
            long x=pq.poll();
            long y=pq.poll();
            pq.add(x*2+y);
            ans++;
        }
        return ans;
        
    }
}
