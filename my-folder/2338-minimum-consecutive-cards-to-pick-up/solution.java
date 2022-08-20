class Solution {
    public int minimumCardPickup(int[] cards) {
        
        int max=Integer.MAX_VALUE;
        HashMap <Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<cards.length;i++)
        {
            
                if(map.containsKey(cards[i]) && max>i-map.get(cards[i])+1)
                {
                    max=i-map.get(cards[i])+1;
                }
                map.put(cards[i],i);
        }
        if(max<=cards.length)
        return max;
        return -1;
    }
}
