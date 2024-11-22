class Pair{
    int key;
    int val;
    Pair(int key, int val)
    {
        this.key=key;
        this.val=val;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int [][] arr=new int[map.size()][2];
        int i=0;
        for (Integer key : map.keySet()) {
            arr[i][0]=key;
            arr[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(arr,(a,b)->(Integer.compare(b[1],a[1])));
        int ans[]=new int[k];

        for(i=0;i<k;i++)
        {
            ans[i]=arr[i][0];
        }
        return ans;*/
        
        //second method
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for (Integer key : map.keySet()) {
            Pair p = new Pair(key,map.get(key));
            pq.add(p);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll().key;
        }
        return ans;
    }
}
