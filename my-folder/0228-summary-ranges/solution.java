class Solution {
    private String build(Integer start, Integer end)
    {
        StringBuilder str = new StringBuilder();
        str.append(start);
        if(start.equals(end)) return str.toString();
        str.append("->");
        str.append(end);
        return str.toString();

    }
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        int i=0;
        Integer start=nums[0];
        Integer end=nums[0];
        while(i<nums.length)
        {
            start=nums[i];
            while(i<nums.length-1 && nums[i]==nums[i+1]-1)
            {
                i++;
            }
            end=nums[i];
            list.add(build(start,end));
            i++;
        }
        return list;
    }
}
