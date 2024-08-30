class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int count=1;

        int [][] ans=new int[n][n];
        int i=0;
        while(top<=bottom && left<=right)
        {
            i=left;
            while(i<=right)
            {
                ans[top][i++]=count++;
            }
            top++;
            i=top;
            while(i<=bottom)
            {
                ans[i++][right]=count++;
            }
            right--;
            i=right;
            while(i>=left)
            {
                ans[bottom][i--]=count++;
            }
            bottom--;
            i=bottom;
            while(i>=top)
            {
                ans[i--][left]=count++;
            }
            left++;
        }
        return ans;
    }
}
