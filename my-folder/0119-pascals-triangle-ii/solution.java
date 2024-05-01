class Solution {
    private int ncr(int n, int r) {
       if (r > n || r < 0) {
            return 0; // Invalid input: return 0
        }
        if(r>n/2) r=n-r;
        // Initialize variables for numerator and denominator
        long ans = 1;

        // Calculate numerator (n * (n-1) * ... * (n-r+1))
        int k=1;
        for (int i = 0; i < r; i++) {
            ans = ans* (n - i);
            ans=ans/k++;
        }
        return (int) ans;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans= new ArrayList<>();

        for(int i=0;i<=rowIndex;i++)
        {
            ans.add(ncr(rowIndex,i));
        }
        return ans;
    }
}
