class Solution {
    private String common(String a, String b)
    {
        int [] c1=new int[26];
        String str="";
        for(int i=0;i<a.length();i++)
        {
            c1[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            if(c1[b.charAt(i)-'a']>0)
            {
                str=str+""+b.charAt(i);
                c1[b.charAt(i)-'a']--;
            }
        }
        return str;
    }
    public List<String> commonChars(String[] words) {
        
        String str=words[0];
        for(int i=1;i<words.length;i++)
        {
            str=common(str,words[i]);
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            ans.add(""+str.charAt(i));
        }
        return ans;
        
        
    }
    
}
