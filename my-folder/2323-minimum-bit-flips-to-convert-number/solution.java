class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        /*if(start<goal)
        {
            int temp=goal;
            goal=start;
            start=temp;
        }*/
        while(goal>0)
        {
            if(goal%2!=start%2)
            {
                count++;
            }
            goal=goal/2;
            start=start/2;
        }
        while(start>0)
        {
            if(start%2==1) count++;
            start=start/2;
        }
        return count;
    }
}
