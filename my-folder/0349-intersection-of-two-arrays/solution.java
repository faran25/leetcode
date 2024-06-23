class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                list.add(nums2[i]);
            }
        }
        list=list.stream().distinct().collect(Collectors.toList());
        int ans[]=new int[list.size()];
        int k=0;
        for(Integer i:list)
        {
            ans[k++]=i;
        }
        return ans;
    }
}
