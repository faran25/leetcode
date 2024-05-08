class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<score.length;i++)
        {
            Pair p = new Pair(i,score[i]);
            pq.add(p);
        }
        String[] ans= new String[score.length];

        int rank=1;
        while(!pq.isEmpty())
        {
            int index=pq.poll().index();
            if(rank == 1 )
            {
                ans[index]="Gold Medal";
            }else if(rank == 2)
            {
                ans[index]="Silver Medal";
            }
            else if (rank == 3)
            {
                ans[index]="Bronze Medal";
            } else 
            {
                ans[index]=rank+"";
            }
            rank++;
        }
        return ans;

    }
    record Pair(int index, int score) implements Comparable<Pair> {
    public int compareTo(Pair o) {
        return o.score() - this.score();
    }
    }
}
