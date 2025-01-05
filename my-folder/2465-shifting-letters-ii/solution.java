class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int []arr=new int[s.length()+1];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<shifts.length;i++)
        {
            int st=shifts[i][0];
            int en=shifts[i][1];
            if(shifts[i][2]==0){
            arr[st]--;
            arr[en+1]++;
            }else
            {
                arr[st]++;
                arr[en+1]--;
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=(arr[i]+s.charAt(i)-'a')%26;
            if(arr[i]<0) arr[i]+=26;
            sb.append((char)(arr[i]+'a'));
        }
        return sb.toString();
    }
}
/*
0,0,0,0
-1,0,1,0
-1,1,1,-1
0,1,1,-2
0,1,2,0
a,c,e
*/


