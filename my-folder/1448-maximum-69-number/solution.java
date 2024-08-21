class Solution {
    public int maximum69Number (int num) {
        int count=3;
        int n=num;
        int ans=0;
        boolean flag=false;
        while(n>0)
        {
            if(n%10==6)
            {
                ans=num+count;
                flag=true;
            }
            n=n/10;
            count=count*10;
        }
        if(flag) return ans;
        return num;
    }
}
