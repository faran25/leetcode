class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        int k=0;
        int []prev=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[] interval = intervals[i];
            if(interval[0] <= prev[1])
            {
                prev[1]=Math.max(prev[1],interval[1]);
            }
            else
            {
                ans.add(prev);
                prev=interval;
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }
}
