class Solution {
    public int numberOfChild(int n, int k) {
        if(k<n) return k;
        int temp=2*(n-1);
        k=k%temp;
    
        if (k < n) {
        return k;
        } else {
        return temp-k;
        }
    }
}
