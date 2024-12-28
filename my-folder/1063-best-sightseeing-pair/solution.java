class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=0;
        int n=values.length;
        int[] arr1=new int[n]; //prefix max
        int[] arr2=new int[n]; //postfix max
        int max=Integer.MIN_VALUE;
        for(int i=0;i<values.length;i++)
        {
            arr1[i]=values[i]+i;
            if(max<arr1[i]) max=arr1[i];
            else
            {
                arr1[i]=max;
            }
            arr2[i]=values[i]-i;
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
            else arr2[i]=max;
        }
        for(int i=0;i<n-1;i++)
        {
            int temp=arr1[i]+arr2[i+1];
            if(ans<temp) ans=temp;
        }
        
        return ans;
    }
}
/**
v[i]+v[j]+i-j
i+v[i] + v[j]-j =max
8,1,5,2,6
8,2,7,5,10 =i+v[i]
8,8,8,8,10=>max ->prefix max
8,0,3,-1,2=v[j]-j
8,3,3,2,2 ->postfix max
 */
