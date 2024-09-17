class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       /* List<String> list = new ArrayList<>(Arrays.asList(s1.split(" ")));
        list.addAll(Arrays.asList(s2.split(" ")));
        String[] ans=list.stream().filter(x -> Collections.frequency(list, x)==1).toArray(String[]::new);
        return ans;*/
        HashMap<String, Integer> map=new HashMap<>();
        String []a1 = s1.split(" ");
        String []a2 = s2.split(" ");
        int count=0;
        for(int i=0;i<a1.length;i++)
        {
            if(map.containsKey(a1[i]))
            {
                map.put(a1[i],2);

            }else
            {
                map.put(a1[i],1);
            }
        }
        for(int i=0;i<a2.length;i++)
        {
            if(map.containsKey(a2[i]))
            {
                map.put(a2[i],2);

            }else
            {
                map.put(a2[i],1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        String[] ans=new String[count];
        count=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans[count++]=entry.getKey();
            }
        }
        return ans;
    }
}
