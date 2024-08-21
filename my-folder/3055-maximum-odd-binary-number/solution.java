class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') zero++;
            else one++;
        }
        for(int i=1;i<one;i++)
        {
            sb.append('1');
        }
        for(int i=0;i<zero;i++) sb.append('0');
        sb.append('1');
        return sb.toString();
    }
}
