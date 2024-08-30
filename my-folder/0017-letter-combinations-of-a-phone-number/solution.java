class Solution {
    private List<String> func(String str, List<String> list)
    {
        List<String> res=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                res.add(list.get(j)+str.charAt(i));
            }
        }
        return res;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        String str[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<String>();
        ans.add("");
        for(int i=0;i<digits.length();i++)
        {
            ans=func(str[digits.charAt(i)-'0'],ans);
        }
        return ans;
    }
}
