class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        if(numRows==1) 
        {
            return ans;
        }
        int count=2;
        for(int i=1;i<numRows;i++)
        {
            ans.add(new ArrayList<Integer>());
            for(int k=0;k<i+1;k++)
            {
                ans.get(i).add(1);
            }
            for(int j=1;j<i;j++)
            {
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
        }
        return ans;
    }
}
