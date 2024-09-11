class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0]) return false;
        if(target>matrix[matrix.length-1][matrix[0].length-1]) return false;
        int left=0;
        int right=(matrix.length)*(matrix[0].length)-1;
        int n=matrix.length;
        int m=matrix[0].length;
        int mid=(left+right)/2;
        while(left<=right)
        {
            mid=(left+right)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
