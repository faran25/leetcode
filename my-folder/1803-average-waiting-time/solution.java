class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wait=0;
        int time=1;
        for(int i=0;i<customers.length;i++)
        {
            if(time >= customers[i][0]){
                time=time+customers[i][1];
                wait += time-customers[i][0];
            }else
            {
                wait += customers[i][1];
                time=customers[i][0]+customers[i][1];
            }
        }
        return wait/customers.length;
    }
}
