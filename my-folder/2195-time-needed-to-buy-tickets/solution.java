class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
            int ans=0;
            int num=tickets[k];
            for(int i=0;i<=k;i++)
            {
                if(tickets[i]>num)
                ans=ans+num;
                else 
                ans=ans+tickets[i];
            }
            num--;
            for(int i=k+1;i<tickets.length;i++)
            {
                if(tickets[i]>num)
                ans=ans+num;
                else
                ans=ans+tickets[i];
            }
            return ans;
    }
}
