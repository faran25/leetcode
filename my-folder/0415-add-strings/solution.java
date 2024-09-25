class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        int num=0;
        while(i>=0 || j>=0 || c>0)
        {
            num=c;
            if(i>=0)
            num+=num1.charAt(i--)-'0';
            if(j>=0)
            num+=num2.charAt(j--)-'0';
            c=num/10;
            str.append(num%10);
        }

        return str.reverse().toString();
    }
}
