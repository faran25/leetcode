class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;

        while(numBottles>=numExchange)
        {
            if(numBottles%numExchange==0)
            {
                numBottles /=numExchange;
                ans +=numBottles;
            }
            else
            {
                int temp=numBottles%numExchange;
                numBottles /=numExchange;
                ans +=numBottles;
                numBottles+=temp;

            }
        }
        return ans;
    }
}
