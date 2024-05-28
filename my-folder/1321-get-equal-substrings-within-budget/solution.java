class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0,j=0,sum=0,max=0;

        while(i<s.length() && j<s.length()){
            sum += Math.abs(s.charAt(j)-t.charAt(j++));
            if(sum<=maxCost){
                max = max>(j-i)?max:j-i;
            }else{
                while(sum>maxCost){
                    sum =sum- Math.abs(s.charAt(i)-t.charAt(i++));
                }
            }
        }
        return max;
    }
}
