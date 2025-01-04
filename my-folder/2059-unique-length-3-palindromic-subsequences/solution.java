class Solution {

    public int countPalindromicSubsequence(String s) {
        int count=0;
        int []first=new int[26];
        int []last=new int[26];
        Arrays.fill(first, Integer.MAX_VALUE);
        for(int i=0;i<s.length();i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            first[s.charAt(i)-'a']=i;
        }

        for(int i=0;i<26;i++)
        {
            if(first[i]<last[i])
            {
                int st=first[i];
                int en=last[i];
                HashSet<Character> set=new HashSet<>();
                for(int j=st+1;j<en;j++)
                {
                    set.add(s.charAt(j));
                }
                count+=set.size();
            }
        }
        
        return count;
    }
}
