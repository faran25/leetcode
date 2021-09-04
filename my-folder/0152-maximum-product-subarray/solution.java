class Solution {
    public int maxProduct(int[] A) {
        int dp1[]= new int[A.length];
        int dp2[]= new int[A.length];
        dp1[0]=A[0];
        dp2[0]=A[0];
        int max=0;
        int min=0;
        int ans=A[0];
        for(int i=1;i<A.length;i++)
        {
            max=Math.max(A[i]*dp1[i-1],A[i]*dp2[i-1]);
            min=Math.min(A[i]*dp1[i-1],A[i]*dp2[i-1]);
            dp1[i]=Math.min(A[i],min);
            dp2[i]=Math.max(A[i],max);
            if(dp2[i]>ans) ans=dp2[i];
        }
        
        return ans;
    }
}
