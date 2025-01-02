class Solution {
    public boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] arr=new int[words.length+1];
        int count=0;
        arr[0]=0;
        for(int i=0;i<words.length;i++)
        {
            char st=words[i].charAt(0);
            char end=words[i].charAt(words[i].length()-1);
            if(isVowel(st) && isVowel(end))
            {
                count++;
            }
            arr[i+1]=count;
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int st=queries[i][0];
            int end=queries[i][1];
            ans[i]=arr[end+1]-arr[st];
        }
        return ans;

    }
}
