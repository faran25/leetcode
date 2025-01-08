class Solution {
    public boolean isPrefixAndSuffix(String a, String b)
    {
        if(a.length()>b.length()) return false;
        if(a.equals(b)) return true;
        if(!a.equals(b.substring(0,a.length()))) return false;
        if(!a.equals(b.substring(b.length()-a.length(),b.length()))) return false;
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        //if(isPrefixAndSuffix("aba","ababa")) count++;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j])) count++;
            }
        }
        return count;
    }
}
