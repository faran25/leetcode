class Solution {
    public int maximumSwap(int num) {
        if(num<10) return num;
        char[] arr=Integer.toString(num).toCharArray();
        int n=arr.length;
        int[] last=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            last[arr[i]-'0']=i;
        }

        for(int i=0;i<n;i++)
        {
            for(int d=9;d>arr[i]-'0';d--)
            {
                if(last[d]>i)
                {
                    char temp=arr[i];
                    arr[i]=arr[last[d]];
                    arr[last[d]]=temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num; 
    }
}
