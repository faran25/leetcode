class Solution {
    public boolean isIsomorphic(String s, String t) {
        //length are already same. so no need to check for unequal lengths
        int [] f1=new int[128];
        int [] f2=new int[128];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(f1[s1[i]]!=f2[t1[i]])
            return false;
            f1[s1[i]]=i+1;
            f2[t1[i]]=i+1;
        }
        return true;
    }
}
