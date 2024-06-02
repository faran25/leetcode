class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] meeting : meetings) {
            if (merged.isEmpty() || merged.getLast()[1] < meeting[0] - 1) {
                merged.add(meeting);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], meeting[1]);
            }
        }
        int count = 0;
        int sum = 0;

        for (int[] interval : merged) {
            if (interval[0] > sum + 1) {
                count += interval[0] - sum - 1;
            }
            sum = interval[1];
        }
        if (sum < days) {
            count += days - sum;
        }

        return count;
    }
}

//1 1 -1 0
