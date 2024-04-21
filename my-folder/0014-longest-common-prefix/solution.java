class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int min=strs[0].length();

        for(int i=1;i<strs.length;i++)
        {
            if(min>strs[i].length())
            {
                min=strs[i].length();
            }
        }
        String ans=strs[0].substring(0,min);
        for(int i=0;i<min;i++)
        {
            char ch= strs[0].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=ch)
                {
                    if(i==0) return "";
                    return strs[j].substring(0,i);
                }
            }
        }
        return ans;
    }
}
