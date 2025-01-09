class Solution {
    public boolean isPrefix(String a, String b)
    {
        if(a.length()>b.length()) return false;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()<pref.length()) continue;
            if(isPrefix(pref,words[i])) count++;
        }
        return count;
    }
}
