class Solution {
    public List<String> cellsInRange(String s) {
        
        List <String> l=new ArrayList<String>();
        char r1=s.charAt(0);
        int c1=s.charAt(1)-'0';
        char r2=s.charAt(3);
        int c2=s.charAt(4)-'0';
        char k=r1;
        
        for(int i=0;i<r2-r1+1;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                l.add(k+""+j);
            }
            k++;
        }
        return l;
        
    }
}
