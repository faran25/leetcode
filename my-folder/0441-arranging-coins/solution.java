class Solution {
    public int arrangeCoins(int n) {
        int sum=1;
        int ans=0;
        while(n>=sum)
        {
            n=n-sum;
            sum++;
            ans++;
        }
        return ans;
    }
}
