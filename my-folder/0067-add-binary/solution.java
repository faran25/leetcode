class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0 || c>0)
        {
            if(i>=0) c+=a.charAt(i)-'0';
            if(j>=0) c+=b.charAt(j)-'0';
            //sb.insert(0,c&1); if using this, we don't need to reverse
            sb.append(c&1);
            c>>=1;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
