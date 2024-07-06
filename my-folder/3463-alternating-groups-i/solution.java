class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int n=colors.length-1;
        int i=0;
        for(i=1;i<colors.length-1;i++)
        {
            if((colors[(i-1)]==colors[(i+1)] 
            && colors[i]!=colors[(i-1)])) 
            count++;
            
        }
        if(colors[1]==colors[n] && colors[1]!=colors[0])
        {
            count++;
        }
        if(colors[0]==colors[n-1] && colors[n]!=colors[n-1])
        {
            count++;
        }
        return count;
    }
}
