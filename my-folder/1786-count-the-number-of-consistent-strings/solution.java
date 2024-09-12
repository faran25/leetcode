class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int arr []=new int[26];

        for(int i=0;i<allowed.length();i++)
        {
            arr[allowed.charAt(i)-'a']++;
        }
        int count=words.length;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(arr[words[i].charAt(j)-'a']==0)
                {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
