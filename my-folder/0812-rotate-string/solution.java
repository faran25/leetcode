class Solution {
    public boolean anagram(String s1, String s2)
    {
        int [] freq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0) {
                return false;
            }
        }
        return true;
    }
    public boolean rotateString(String s1, String s2) {
        if(s1.length()!=s2.length() || !anagram(s1,s2)) return false;
        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();

        for(int i=0;i<arr1.length;i++)
        {
            if(check(arr1,arr2,i))
            return true;
        }
        return false;

    }

    private boolean check(char []arr1, char []arr2, int rotation)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[(i+rotation)%arr2.length])
            return false;
        }
        return true;
    }
}
