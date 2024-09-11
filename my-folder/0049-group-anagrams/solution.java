class Solution {
    private String sort(String str)
    {
        int []arr=new int[26];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                int k=arr[i];
                while(k>0)
                {
                    ans=ans.append((char)(97+i));
                    k--;
                }
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String,List<String>> map=new HashMap<>();
        ArrayList<List<String>> ans=new ArrayList<>();
        for(int i=0;i<str.length;i++)
        {
            if(map.containsKey(sort(str[i])))
            {
                List<String> list=map.get(sort(str[i]));
                list.add(str[i]);
                map.put(sort(str[i]),list);
            }else
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(str[i]);
                map.put(sort(str[i]),list);
            }
        }
        Iterator<Map.Entry<String, List<String>>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();
            ans.add(entry.getValue());
        }
        return ans;
        //return new ArrayList(map.values());
    }
}
