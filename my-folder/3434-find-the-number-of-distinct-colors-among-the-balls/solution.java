class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[queries.length];
        HashMap<Integer,Integer> map2=new HashMap<>();
        int count=0;
        for(int i=0;i<queries.length;i++)
        {
            int[] q=queries[i];
            int val=0;
            if(q[1]!=0 && map2.containsKey(q[0])) val=map2.get(q[0]);
            if(map.containsKey(q[1]))
            {
                map.put(q[1],map.get(q[1])+1);
            }
            else
            {
                map.put(q[1],1);
                count++;
            }
            if(val!=0)
            {
                if(map.get(val)==1 || map.get(val)==0)
                {
                map.remove(val);
                count--;
                }
                else
                {
                map.put(val,map.get(val)-1);
                }
            }
            ans[i]=count;
            map2.put(q[0],q[1]);
        }
        return ans;
    }
}
