class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length==0) return true;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int[] prev=new int[2];
        prev[0]=intervals[0][0];
        prev[1]=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(prev[1]>intervals[i][0]) return false;
            prev=intervals[i];
        }
        return true;
    }
}
