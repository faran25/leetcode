class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] row=new int[matrix.length];
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<matrix.length;i++)
        {
            int min=matrix[i][0];
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                }
            }
            row[i]=min;
        }

        for(int i=0;i<matrix[0].length;i++)
        {
            int max=matrix[0][i];
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]>max)
                {
                    max=matrix[j][i];
                }
            }
            set.add(max);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        int min=matrix.length;
        for(int i=0;i<min;i++)
        {
            if(set.contains(row[i])) list.add(row[i]);
        }
        return list;
    }
}
/*
3  7  8
9  11 13
15 16 17
*/
