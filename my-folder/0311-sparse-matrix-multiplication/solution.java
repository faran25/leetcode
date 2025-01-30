class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int a=mat1.length;
        int b=mat2.length;
        int c=mat2[0].length;
        int[][] arr=new int[a][c];
        for(int i=0;i<a;i++)
        {
            
            int k=0;
            while(k<c)
            {
                int sum=0;
                for(int j=0;j<b;j++)
                {
                    if(mat1[i][j]==0 || mat2[j][k]==0) continue;
                    sum+=mat1[i][j]*mat2[j][k];
                }
                arr[i][k]=sum;
                k++;
            }
        }
        return arr;
    }
}
