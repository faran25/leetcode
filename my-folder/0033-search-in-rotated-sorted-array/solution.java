class Solution {
    private int binarySearch(int[] nums, int target, int left, int right) {
        int mid = 0;
        int n = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int n = nums.length - 1;
        if (nums[0] < nums[n]) { // if array is not rotated, then apply binary search directly.
            return binarySearch(nums, target, 0, n);
        }

        while (left < right) { // finding the pivot
            mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // int left contains the pivot, i.e the smallest element of a general case.
        if (target <= nums[n]) {
            right = n;
        } else {
            right = left;
            left = 0;
        }
        return binarySearch(nums, target, left, right);
    }
}
