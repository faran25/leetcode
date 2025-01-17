class Solution {
    public int squareRoot(int n)
    {
        int l=0;
        int r=n;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            long s=(long)mid*mid;
            if(s==n)
            {
                return mid;
            }
            else if(s>n)
            {
                r=mid-1;
            }else
            {
                l=mid+1;
            }
        }
        return l-1;// either l-1 or r will give the correct answer

    }
    public int bulbSwitch(int n) {
        return squareRoot(n);
    }
}

/*0 0 0 0 0 0
1 1 1 1 1 1
1 0 1 0 1 0 
1 0 0 0 0 1
1 0 0 1 0 0
*/
