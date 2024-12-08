class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set, banned);
        String[] arr=paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", " ").split("\\s+");
        HashMap<String, Integer> map=new HashMap<>();
        String ans=new String();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]) && !set.contains(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if(value>max)
            {
                max=value;
                ans=key;
            }
        }
        return ans;
    }
}
