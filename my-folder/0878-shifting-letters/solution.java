class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i=shifts.length-2;i>=0;i--)
        {
            shifts[i]=shifts[i]%26;
            shifts[i]+=shifts[i+1];
        }
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<shifts.length;i++)
        {
            shifts[i]=(shifts[i]+s.charAt(i)-'a')%26;
            if(shifts[i]<0) shifts[i]+=26;
            sb.append((char)(shifts[i]+'a'));
        }
        return sb.toString();
    }
}
