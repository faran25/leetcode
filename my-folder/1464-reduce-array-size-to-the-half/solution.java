

class Solution {
    public int minSetSize(int[] arr){
        HashMap <Integer, Integer> map=new HashMap();
        ArrayList<Integer> list=new ArrayList();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
         
        while(itr.hasNext())
        {
             Map.Entry<Integer,Integer> entry = itr.next();
             list.add(entry.getValue());
        }
        
        map.remove(map);
        // map.forEach((k,v) -> list.add(v));
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>            (Collections.reverseOrder());
        pq.addAll(list);
        count=arr.length;
        int k=0;
        while(pq.size()>0 && count>arr.length/2)
        {
            count=count-pq.poll();
            k++;
            
        }
        return k;
    }
}
