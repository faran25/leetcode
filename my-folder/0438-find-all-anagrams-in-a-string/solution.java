class Solution {
    public boolean check(String s, int[] f)
    {
        int [] freq=new int[26];
        for(int i=0;i<26;i++)
        {
            freq[i]=f[i];
        }
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++)
        {
            freq[p.charAt(i)-'a']++;
        }
        for(int i=m;i<=n;i++)
        {
            if(check(s.substring(i-m,i),freq))
            {
                list.add(i-m);
            }
        }
        /*for(int i=0;i<26;i++)
        {
            //System.out.print(freq[i]+" ");
        }*/
        return list;
    }
}
