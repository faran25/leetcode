class Solution {
    int ans=0;
    public boolean helper(HashMap<Character,Integer> map, String str)
    {
        int []f=new int[26];
        for(int i=0;i<str.length();i++)
        {
            f[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(f[i]>0)
            {
                char ch=(char)(i+'a');
                if(!(map.containsKey(ch) && map.get(ch)>=f[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public void reduce(HashMap<Character,Integer> map, String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            map.put(ch,map.get(ch)-1);
        }
    }
    public void increase(HashMap<Character,Integer> map, String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            map.put(ch,map.get(ch)+1);
        }
    }
    public void back(int[] arr, String[] words, HashMap<Character,Integer> map, int index,int currSum)
    {
        if(index>=arr.length) {
            if(currSum>ans) ans=currSum;
            return;
        }

        if(helper(map, words[index]))
        {
            back(arr,words,map,index+1,currSum);
            reduce(map,words[index]);
            back(arr,words,map,index+1,currSum+arr[index]);
            increase(map,words[index]);
        }
        else{
            back(arr,words,map,index+1,currSum);
        }
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<letters.length;i++)
        {
            if(map.containsKey(letters[i]))
            {
                map.put(letters[i],map.get(letters[i])+1);
            }else
            {
                map.put(letters[i],1);
            }
        }
        int arr[]=new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            int sum=0;
            for(int j=0;j<str.length();j++)
            {
                sum=sum+score[str.charAt(j)-'a'];
            }
            arr[i]=sum;
        }
        back(arr,words,map,0,0);
        return ans;
    }
}
