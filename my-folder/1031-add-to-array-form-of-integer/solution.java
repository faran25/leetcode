class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=0;
        if(k<10) n=1;
        else if(k>9 && k<100) n=2;
        else if(k>99 && k<1000) n=3;
        else if(k>999 && k<10000) n=4;
        else n=5;
        int[] arr=new int[n];
        n--;
        while(k>0)
        {
            arr[n]=k%10;
            n--;
            k=k/10;
        }
        n=arr.length-1;;
        int i=num.length-1;
        int c=0;
        List<Integer> list=new ArrayList<>();
        while(i>=0 || n>=0 || c>0)
        {
            if(i>=0) c+=num[i];
            if(n>=0) c+=arr[n];
            n--;
            i--;
            list.add(c%10);
            c=c/10;
        }
        Collections.reverse(list);
        return list;
    }
}
