class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int count=0;
        int[] f=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)) count++;
            f[s1.charAt(i)-'a']++;
            f[s2.charAt(i)-'a']--;
            if(count>2) return false;
        }
        for(int i=0;i<26;i++)
        {
            if(f[i]!=0) return false;
        }
        if(count==2) return true;
        return false;
    }
}
