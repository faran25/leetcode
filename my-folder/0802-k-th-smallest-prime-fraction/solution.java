class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        float lo = 0, hi = 1;
        while (lo < hi) {
            float mid = (lo + hi) / 2;
            int[] res = countFractions(arr, mid);
            if (res[0] < k) lo = mid;
            else if (res[0] > k) hi = mid;
            else return new int[]{res[1], res[2]};
        }
        return null;
    }
    public static int[] countFractions(int[] arr, float target) {
        int count = 0, num = 0, den = 1, n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && arr[i] >= target * arr[j]) j++;
            count += n - j;
            if (j < n && num * arr[j] < den * arr[i]) {
                num = arr[i];
                den = arr[j];
            }
        }
        return new int[]{count, num, den};
    }
}

