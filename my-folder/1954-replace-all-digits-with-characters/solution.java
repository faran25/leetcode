class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        int shift=0;
        char ch='a';
        boolean flag=false;
        for(int i=1;i<s.length();i=i+2)
        {
            ch=s.charAt(i-1);
            sb.append(ch);
            shift=s.charAt(i)-'0'+ch;
            sb.append((char)(shift));
            
        }
        if(s.length()%2==1)
        {
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}
