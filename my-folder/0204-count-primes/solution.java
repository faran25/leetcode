class Solution {
    public boolean checkPrime(int n, ArrayList<Integer> list)
    {
        if(n%2==0) return false;
        int root=(int)Math.sqrt(n);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>root) break;
            if(n%list.get(i)==0) return false;
        }
        list.add(n);
        return true;

    }
    public int countPrimes(int n) {
        /*if(n==0 || n==1 || n==2) return 0;
        ArrayList<Integer> list=new ArrayList<>();
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=0;
        dp[3]=1;
        list.add(2);
        for(int i=4;i<=n;i++)
        {
            if(checkPrime(i-1,list))
            {
                dp[i]=dp[i-1]+1;
            }
            else
            {
                dp[i]=dp[i-1];
            }
        }
        return dp[n];*/
        // second approach
        /*if(n==0 || n==1 || n==2) return 0;
        int [] dp=new int[n+1];
        int[] arr=new int[n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        for(int i=4;i<=n;i=i+2)
        {
            arr[i]=0;
        }
        int ans=1;
        int i=3;
        while(i<=n)
        {
            if(arr[i]==0)
            {
                i=i+2;
                continue;
            }
            else if(checkPrime(i,list))
            {
                arr[i]=1;
                if(i==n) return ans;
                ans++;
                for(int j=3*i;j<=n;j=j+2*i)
                {
                    arr[j]=0;
                }
            }
            i=i+2;
        }
        return ans;
        */

        //third approach
        if(n==0 || n==1 || n==2) return 0;
        int [] dp= new int[n+1];
        int ans=1;

        for(int i=4;i<n;i=i+2)
        {
            dp[i]=1;
        }
        for(int i=3;i<n;i++)
        {
            if(dp[i]==0) //this means the number is prime
            {
                ans++;
                for(int j=3;i*j<n;j=j+2)
                {
                    dp[i*j]=1;
                }
            }
        }
        return ans;
    }
}
/*
0 1 2 3 4 5 
0 0 0 0 0 0
*/
