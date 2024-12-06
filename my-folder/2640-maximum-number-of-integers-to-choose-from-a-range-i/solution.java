class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean flag = false;
        int min = maxSum;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        int count = 0;
        int sum = 0;
        for (int i = 1; i <n+1; i++) {
            if (set.contains(i))
                continue;
            sum += i;

            if (sum > maxSum)
                break;
            count++;

        }
        return count;
    }
}

/*
 * n*(n+1)/2<=maxSum
 * n*n+n<=2*sum
 * n*n+n-k<=0
 * -1+sqrt(1+4*a*k)/2
 * (4k-1)/2
 */
