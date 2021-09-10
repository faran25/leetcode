
class Solution {
    
    public int numberOfWeakCharacters(int[][] A) {
        Arrays.sort(A, (a,b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : 
                    Integer.compare(a[0], b[0]));
        int count=0;
        int max=A[A.length-1][1];
        for(int i=A.length-2;i>=0;i--)
        {
            int att=A[i][0];
            int def=A[i][1];
            if(def<max)
            {
                count++;
            }else
            {
                max=def;
               // temp=att;
            }
            /*for(int j=list.size()-1;j>i;j--)
            {
                if(att<list.get(j).a && def<list.get(j).b)
                {
                    count++;
                    //System.out.println(att+" "+def+" "+list.get(j).a+" "+list.get(j).b);
                    break;
                }
            }*/
            //System.out.println(att+" "+def);
        }
        return count;
        
    }
}
