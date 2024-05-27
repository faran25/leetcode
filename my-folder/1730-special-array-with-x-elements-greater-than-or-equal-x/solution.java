class Solution {
    public int specialArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);

        for (int i = 1; i <= nums.length; i++) {
            int candidate = nums.length - i;
            
            if (nums[candidate] >= i && (candidate == 0 || nums[candidate-1] < i)) {
                return i;
            }
        }
        
        return -1;
    }
}
