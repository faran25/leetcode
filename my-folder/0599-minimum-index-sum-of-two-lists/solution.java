class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<list1.length;i++)
        {
            if(!map.containsKey(list1[i]))
            {
                map.put(list1[i],i);
            }
        }
        int min=list1.length+list2.length;
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]) && i+map.get(list2[i])<min)
            {
                min=i+map.get(list2[i]);
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]) && i+map.get(list2[i])==min)
            {
                list.add(list2[i]);
            }
        }
       
        return list.toArray(new String[0]);
    }
}
