class Solution {
    public String removeDigit(String number, char digit) {
        
        int index1=0;
        boolean flag =true;
        if(number.charAt(0)==digit && number.charAt(0)<number.charAt(1))
        {    
            return number.substring(1,number.length());
        }
        for(int i=1;i<number.length()-1;i++)
        {
            if(number.charAt(i)==digit) 
            {
                index1=i;
                if(number.charAt(i)<number.charAt(i+1))
                {
                    return number.substring(0,i)+""+number.substring(i+1,number.length());
                }
                else if(flag && number.charAt(i-1)==digit) 
                {
                    index1=i;
                    flag=false;
                }
            }
        }
        if(number.charAt(number.length()-1)==digit) return number.substring(0,number.length()-1);
        else if(index1==0) return number.substring(1,number.length());
        return number.substring(0,index1)+number.substring(index1+1,number.length());
        /*StringBuilder sb = new StringBuilder(number);
        String maxRes=""; //Result string
        int i; int j=0;
        for(i=0; i<sb.length()-1; i++){
            if(sb.charAt(i)==digit){
                j=i;
                if((int)(sb.charAt(i))<
                      (int)(sb.charAt(i+1))){
                    return String.valueOf(sb.deleteCharAt(i));
                }
            }
        }
        if(sb.charAt(sb.length()-1)==digit)  //As we have not checked the last element above
        return String.valueOf(sb.deleteCharAt(sb.length()-1));  //If the last element equals digit then we delete it and return;
        return String.valueOf(sb.deleteCharAt(j)); /*Else we delete the last occurance of the
		digit and return the maxRes*/
        
    }
}
