class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list=new ArrayList<>();
        int n=mountain.length-1;
        for(int i=1;i<n;i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
            {
                list.add(i);
            }
        }
        return list;
    }
}
