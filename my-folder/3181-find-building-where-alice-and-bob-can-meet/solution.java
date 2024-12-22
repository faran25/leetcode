class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n=heights.length;
        int []arr=new int[n];
        int []arr2=new int[n];
        int max=-1;
        for(int i=n-1;i>=0;i--)
        {
            arr2[i]=max;
            if(max<heights[i]) max=heights[i];
        }
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<n;j++)
            {
                if(heights[j]>heights[i])
                {
                    arr[i]=j;
                    flag=true;
                    break;
                }
            }
            if(!flag) arr[i]=-1;
        }
        int [] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int a=queries[i][0];
            int b=queries[i][1];
            if(a==b) {
                ans[i]=a;
                continue;
            }
            else if(a>b)
            {
                int temp=a;
                a=b;
                b=temp;
            }
            int n1=heights[a];
            int n2=heights[b];
            //System.out.println(i+": "+n1+" "+n2+" "+arr[a]+" "+arr[b]+" ");
            if(n2>n1)
            {
                ans[i]=b;
                continue;
            }
            else if(n1==n2)
            {
                ans[i]=arr[b];
            }
            else
            {
                if(arr[b]==-1 || arr[a]==-1)
                {
                    ans[i]=-1;
                    continue;
                }
                if(arr[a]>=arr[b])
                {
                    ans[i]=arr[a];
                    continue;
                }
                else
                {
                    boolean flag=false;
                    if(arr2[b]<=n1) 
                    {
                        ans[i]=-1;
                        continue;
                    }
                    for(int j=arr[b];j<n;j++)
                    {
                        if(heights[j]>n1 && heights[j]>n2)
                        {
                            ans[i]=j;
                            //System.out.println(n1+" "+n2+" "+arr[a]+" "+arr[b]+" "+j);
                            flag=true;
                            break;
                        }
                    }
                    if(!flag) ans[i]=-1;
                }
            }
        }
        return ans;
    }
}
