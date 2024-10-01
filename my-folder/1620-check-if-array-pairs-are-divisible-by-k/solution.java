class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[]=new int[k];
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int rem=(num)%k;
            if(rem<0) rem=rem+k;
            freq[rem]++;

        }
        if(freq[0]%2==1) return false;
        int i=1;
        int j=freq.length-1;
        while(i<j)
        {
            if(freq[i]==freq[j])
            {
                i++;
                j--;
            }else
            {
                return false;
            }
        }    
        return true;
    }
}
