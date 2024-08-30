class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            int k=0;
            String str=words[i];
            while(k<str.length())
            {
                if(str.charAt(k++)==x)
                {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
