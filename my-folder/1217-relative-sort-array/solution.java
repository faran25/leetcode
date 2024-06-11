class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }else
            {
                map.put(arr1[i],1);
            }
        }
        List<Integer> list=new ArrayList<>();
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(map.containsKey(arr2[i]))
            {
                while(map.get(arr2[i])>0)
                {
                    arr1[k++]=arr2[i];
                    map.put(arr2[i], map.get(arr2[i])-1);
                }
                map.remove(arr2[i]);
            }
        }
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
            int value = (mapElement.getValue());
            while(value!=0)
            {
                list.add(key);
                value--;
            }
        }
        Collections.sort(list);

        for(int i=0;i<list.size();i++)
        {
            arr1[k++]=list.get(i);
        }
        return arr1;
    }
}
