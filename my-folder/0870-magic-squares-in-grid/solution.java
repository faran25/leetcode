class Solution {
    private boolean check(int[][] rows,int[][] cols,int[][] grid, int i,int j)
    {
        if(grid[i][j]>9 || grid[i+1][j]>9 || grid[i+2][j]>9 
        || grid[i][j+1]>9 || grid[i+1][j+1]>9 || grid[i+2][j+1]>9 
        || grid[i][j+2]>9 || grid[i+1][j+2]>9 || grid[i+2][j+2]>9 ) return false;
        if(grid[i][j]<1 || grid[i+1][j]<1 || grid[i+2][j]<1 
        || grid[i][j+1]<1 || grid[i+1][j+1]<1 || grid[i+2][j+1]<1 
        || grid[i][j+2]<1 || grid[i+1][j+2]<1 || grid[i+2][j+2]<1 ) return false;
        Set<Integer> set = new HashSet<>();
        
        for(int ii=i;ii<i+3;ii++)
        {
            for(int jj=j;jj<j+3;jj++)
            {
                if(set.contains(grid[ii][jj])) return false;
                set.add(grid[ii][jj]);
            }
        }

        int a=rows[i+2][j]-rows[i][j]+grid[i][j];
        int b=rows[i+2][j+1]-rows[i][j+1]+grid[i][j+1];
        int c=rows[i+2][j+2]-rows[i][j+2]+grid[i][j+2];
        //System.out.println(a+" "+b+" "+c);
        if(a!=b || a!=c || b!=c) return false;
        a=cols[i][j+2]-cols[i][j]+grid[i][j];
        b=cols[i+1][j+2]-cols[i+1][j]+grid[i+1][j];
        c=cols[i+2][j+2]-cols[i+2][j]+grid[i+2][j];
        //System.out.println(a+" "+b+" "+c);
        if(a!=b || a!=c || b!=c) return false;
        a=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
        b=grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
        //System.out.println(a+" "+b+" "+c);
        if(a!=b || a!=c || b!=c) return false;
        //System.out.println("true");
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        
        int [][] rows=new int[grid.length][grid[0].length];
        int [][] col=new int[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid[0].length;i++)
        {
            int sum=0;
            for(int j=0;j<grid.length;j++)
            {
                sum=sum+grid[j][i];
                rows[j][i]=sum;
            }
        }

        for(int i=0;i<grid.length;i++)
        {
            int sum=0;
            for(int j=0;j<grid[0].length;j++)
            {
                sum=sum+grid[i][j];
                col[i][j]=sum;
            }
        }
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[0].length-2;j++)
            {
                if(check(rows,col,grid,i,j))
                {
                    count++;
                }
            }
        }
        /*for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                System.out.print(rows[i][j]+" ");
            }
            System.out.println();
        }*/
        return count;
    }
}

/*
10 3 5
1 6 11
7 9 2
*/ 
