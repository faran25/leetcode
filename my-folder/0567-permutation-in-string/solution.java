class Solution {
    public boolean check(int[] f1,int[] f2)
    {
        for(int i=0;i<26;i++)
        {
            if(f1[i]!=f2[i]) return false;
        }
        return true;
    }
    public boolean check2(int[] f1,int[] f2,int l, int k)
    {
        for(int i=0;i<26;i++)
        {
            if(f1[i]!=f2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq=new int[26];
        int n=s1.length();
        int[] f2=new int[26];
        for(int i=0;i<n;i++)
        {
            freq[s1.charAt(i)-'a']++;
            f2[s2.charAt(i)-'a']++;
        }
        if(check(freq,f2)) return true;
        int k=n;
        int l=0;
        while(k<s2.length())
        {
            int a=s2.charAt(l)-'a';
            int b=s2.charAt(k)-'a';
            f2[a]--;
            f2[b]++;
            if(freq[a]==f2[a] && freq[b]==f2[b] && check(freq,f2))
            return true;
            k++;
            l++;
        }
        return false;
    }
}
