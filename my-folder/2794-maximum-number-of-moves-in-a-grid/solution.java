class Solution {
    int dp[][] ;
    public boolean isValid(int grid[][], int val, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || (val >= grid[i][j]))
            return false;
        return true;
    }

    public int moves(int[][] grid, int i, int j) {
        if (j == grid[0].length - 1) {
            return 0;
        }
        if(dp[i][j]>0) return dp[i][j];
        int sum = 0;
        int val = grid[i][j];
        if (isValid(grid, val, i - 1, j + 1)) {
            sum = 1 + moves(grid, i - 1, j + 1);
        }
        if (isValid(grid, val, i, j + 1)) {
            sum = Math.max(sum, 1 + moves(grid, i, j + 1));
        }
        if (isValid(grid, val, i + 1, j + 1)) {
            sum = Math.max(sum, 1 + moves(grid, i + 1, j + 1));
        }
        dp[i][j]=sum;
        return sum;
    }

    public int maxMoves(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            int curr = moves(grid, i, 0);
            if (curr > max)
                max = curr;
        }
        return max;
    }
}
/*
 * i,j
 * i-1,j+1
 * i ,j+1
 * i+1,j+1
 */
