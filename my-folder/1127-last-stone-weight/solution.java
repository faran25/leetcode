class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        while (pq.size()>1)
        {
            int y=pq.poll();
            int x=pq.poll();
            if(x==y && pq.size()==0) return 0;
            if(x==y && pq.size()==1) return pq.poll();
            if(x==y) continue;
            y=y-x;
            pq.add(y);
        }
        return pq.peek();
    }
}
