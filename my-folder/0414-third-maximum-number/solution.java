class Solution {
    public int thirdMax(int[] nums) {
        Integer first=null;
        Integer second=null;
        Integer ans=null;
        for(Integer i:nums)
        {
            if(i.equals(first) || i.equals(second) || i.equals(ans)) continue;
            if(first==null || i>first)
            {
                ans=second;
                second=first;
                first=i;
            }
            else if(second==null || i>second)
            {
                ans=second;
                second=i;
            }
            else if(ans==null || i>ans)
            ans=i;
        }
        if(ans==null) return first;
        return ans;
    }
}
