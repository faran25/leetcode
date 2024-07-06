class Solution {
    public int passThePillow(int n, int time) {
        time=time%(2*n-2);
        if(time<=n-1) return time+1;
        else {
            time=time%n;
            return n-time-1;
        }
    }
}
