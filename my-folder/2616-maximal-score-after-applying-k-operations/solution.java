class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        while (k != 0) {
            int temp = pq.poll();
            ans = ans + temp;
            double s = (double) temp / 3;
            pq.add((int) Math.ceil(s));
            k--;
        }
        return ans;
    }
}
