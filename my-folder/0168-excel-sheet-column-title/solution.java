class Solution {
    public String convertToTitle(int A) {
        String B="";
        char ch;
        do{
            if(A%26==0)
            {
                ch='Z';
            B=ch+B;
            A=A-26;
            A=A/26;
            }else
            {
            ch=(char)(A%26+64);
            B=ch+B;
            A=A/26;
            }
        }while(A>0);
        return B;
    }
}
