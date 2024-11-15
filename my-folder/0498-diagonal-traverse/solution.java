class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count=n*m;
        int k=0;
        int []ans=new int[count];
        int i=0;
        int j=0;
        boolean flag=true;
        while(k<count)
        {
            if(flag)
            {
                while(k<count && i>=0 && j<m)
                {
                    ans[k++]=mat[i--][j++];
                }
                flag=false;
                if(j>=m) {
                    j--;
                    i=i+2;
                }
                else if(i<0) i=0;
                
                
            }
            else
            {
            while(k<count && i<n && j>=0)
            {
                ans[k++]=mat[i++][j--];
            }
                flag=true;
                if(i>=n) {
                    i--;
                    j=j+2;
                }
                else if(j<0)
                {
                    j=0;
                }
            }
            
        }
        return ans;
    }
}
