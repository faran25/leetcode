class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str=new StringBuilder();
        if(s.length()<=k)
        {
            return str.append(s).reverse().toString();
        }
        int i=0;
        while(i<s.length())
        {
            int j=i;
            StringBuilder sb=new StringBuilder();
            while(j<s.length() && j<i+k)
            {
                sb.append(s.charAt(j));
                j++;
            }
            str.append(sb.reverse());
            sb.delete(0,sb.length());
            while(j<s.length() && j<i+2*k)
            {
                str.append(s.charAt(j));
                j++;
            }
            i=i+2*k;
        }
        return str.toString();
    }
}
