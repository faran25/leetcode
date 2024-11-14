class Solution {
    public int[] constructRectangle(int area) {
        int max=(int)Math.sqrt(area);
        if(max*max==area)
        {
            return new int[]{max,max};
        }
        while (max>=1)
        {
            if(area%max==0)
            {
                return new int[]{area/max,max};
            }
            max--;
        }
        return null;
        //int L=total
    }
}
