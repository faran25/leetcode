class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int a=s1.length();
        int b=s2.length();
        int c=s3.length();
        int min=Math.min(a,b);
        min=Math.min(min,c);
        int i=0;
        for(i=0;i<min;i++)
        {
            if(!(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)))
            {
                break;
            }
        }
        if(i==0) return -1;
        return a+b+c-3*i;
    }
}
