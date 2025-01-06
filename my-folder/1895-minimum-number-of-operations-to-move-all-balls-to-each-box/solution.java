class Solution {
    public int[] minOperations(String boxes) {
        int count=0;
        int sum=0;
        char[] charr=boxes.toCharArray();
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            sum+=count;
            ans[i]=sum;
            if(charr[i]=='1')
            {
                count++;
            }
        }
        count=0;
        sum=0;
        for(int i=boxes.length()-1;i>=0;i--)
        {
            sum+=count;
            ans[i]+=sum;
            if(charr[i]=='1')
            {
                count++;
            }
        }
        return ans;
    }
}
/*
1 1 0 1 0 0
0,1,3,5,8,11
,1,0,0,0
*/
