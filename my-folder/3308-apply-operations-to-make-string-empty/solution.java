class Solution {
    public String lastNonEmptyString(String s) {
        
        int []freq=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        
        int max=0;
        
        for(int i=0;i<26;i++)
        {
            if(freq[i]>max) max=freq[i];
        }
        
        HashSet set = new HashSet<>();
        String ans="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(freq[s.charAt(i)-'a']==max && !set.contains(s.charAt(i))) 
            {
                ans=ans+s.charAt(i);
                set.add(s.charAt(i));
            }
        }
        String f="";
        
        for(int i=ans.length()-1;i>=0;i--)
        {
            f=f+ans.charAt(i);
        }
        return f;
            
        
        
    }
}
