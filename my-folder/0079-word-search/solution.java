class Solution {
    boolean vis[][];
    boolean flag=false;
    public boolean isValid(char[][] board, int index, String word, int i, int j)
    {
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || vis[i][j] || word.charAt(index)!=board[i][j]) return false;
        return true;
    }
    public void backtrack(char[][] board, int index, String word, int i, int j)
    {
        if(!isValid(board,index,word,i,j)) return; //checking base condition
        if(index==word.length())
        {
            flag=true;
            return;
        }
        vis[i][j]=true; //do
        //backtracking
        backtrack(board,index+1,word,i+1,j);
        backtrack(board,index+1,word,i,j+1);
        backtrack(board,index+1,word,i-1,j);
        backtrack(board,index+1,word,i,j-1);
        vis[i][j]=false;//undo
    }

    public boolean exist(char[][] board, String word) {
        vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(flag) return true;
                backtrack(board,0,word,i,j);
            }
        }
        return flag;
    }
}
