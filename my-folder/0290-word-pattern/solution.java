class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!arr[i].equals(map.get(pattern.charAt(i))))
                {
                    return false;
                }
            }
            else
            {
                map.put(pattern.charAt(i),arr[i]);
            }
        }
        HashSet<String> set=new HashSet<>();
        for(Character c:map.keySet())
        {
            String val=map.get(c);
            if(set.contains(val))
            {
                return false;
            }
            set.add(val);
        }
        return true;
    }
}
