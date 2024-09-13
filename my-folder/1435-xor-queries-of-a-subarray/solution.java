class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]^arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(queries[i][0]>0)
            ans[i]=arr[queries[i][0]-1]^arr[queries[i][1]];
            else
            ans[i]=arr[queries[i][1]];
        }
        return ans;
    }
}
