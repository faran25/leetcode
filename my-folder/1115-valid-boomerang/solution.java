class Solution {
    public boolean isBoomerang(int[][] points) {
        double y3 = (points[2][1] - points[1][1]);
        double y2 = (points[1][1] - points[0][1]);
        double x3 = (points[2][0] - points[1][0]);
        double x2 = (points[1][0] - points[0][0]);
        if(y3*x2==y2*x3) return false;
        return true;
    }
}

