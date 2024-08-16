class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size() - 1);
        int ans=0;
        for(int i=1;i<arrays.size();i++)
        {
            List<Integer> list=arrays.get(i);
            int tempMin=list.get(0);
            int tempMax=list.get(list.size()-1);
            ans=Math.max(ans, Math.max(
                tempMax-min,max-tempMin
            ));
            min=Math.min(min,tempMin);
            max=Math.max(max,tempMax);
        }
        return ans;
    }
}
