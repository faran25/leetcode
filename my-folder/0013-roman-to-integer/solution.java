class Solution {
    public int romanToInt(String s) {
        HashMap<Character ,Integer> alpha= new  HashMap<Character ,Integer> ();
        alpha.put('I',1);
        alpha.put('V',5);
        alpha.put('X',10);
        alpha.put('L',50);
        alpha.put('C',100);
        alpha.put('D',500);
        alpha.put('M',1000);
        int i;
        int sum=0,old=0;
        for(i=0;i<s.length()-1;i++){
                 
            if((alpha.get(s.charAt(i))<alpha.get(s.charAt(i+1)))){
              sum=sum-alpha.get(s.charAt(i));
                
            }
            else{
              sum=sum+alpha.get(s.charAt(i));
            }
            
            //System.out.println(sum);
            
        }
        sum=sum+alpha.get(s.charAt(i));

        return sum;
        
    }
}
