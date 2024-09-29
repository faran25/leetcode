class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder str=new StringBuilder();
        boolean flag=false;
        if(num<0) {
            num=num*-1;
            flag=true;
        }
        
        while(num>0)
        {
            str.append(num%7);
            num=num/7;
        }
        if(flag){
            str.append("-");
        }
        return str.reverse().toString();
        
    }
}
