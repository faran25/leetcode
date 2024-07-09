class Solution {
    public int findTheWinner(int n, int k) {
        int [] arr=new int[n];
        Arrays.fill(arr,1);
        int count=0;
        int i=1;
        int temp=1;
        //Arrays.stream(arr).forEach(t->System.out.print(t+" "));
        while(count<n-1)
        {
            for(i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    if(temp==k)
                    {
                        arr[i]=0;
                        temp=1;
                        count++;
                        if(count==n-1) break;
                    }
                    else
                    {
                        temp++;
                    }
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1) return i+1;
        }
        return arr[0];
    }
}
