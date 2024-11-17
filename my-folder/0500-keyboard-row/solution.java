class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> set1=new HashSet<>();
        Collections.addAll(set1,'Q','W','E','R','T','Y','U','I','O','P','w','e','r','t','y','q','u','i','o','p');
        HashSet<Character> set2=new HashSet<>();
        Collections.addAll(set2,'A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l');
        HashSet<Character> set3=new HashSet<>();
        Collections.addAll(set3,'Z','X','C','V','B','N','M','z','x','c','v','b','n','m');

        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            char [] str=words[i].toCharArray();
            boolean flag=true;
            for(char ch:str)
            {
                if(!set1.contains(ch))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                list.add(words[i]);
                continue;
            }

            flag=true;
            for(char ch:str)
            {
                if(!set2.contains(ch))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                list.add(words[i]);
                continue;
            }

            flag=true;
            for(char ch:str)
            {
                if(!set3.contains(ch))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                list.add(words[i]);
            }
        }
        //return list.toArray(new String[0]);
        String[] ans=new String[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}
