class Solution {
    public int countQuadruplets(int[] A) {
        int count=0;
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                for(int k=j+1;k<A.length;k++)
                {
                    for(int l=k+1;l<A.length;l++)
                    {
                        if(A[l]==A[i]+A[j]+A[k])
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
