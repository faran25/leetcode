class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=0;
        if(left==0) return 0;
        if(left==right) return right;
        while(left!=right)
        {
            left=left>>1;
            right=right>>1;
            ans++;
        }
        return left<<ans;
    }
}
