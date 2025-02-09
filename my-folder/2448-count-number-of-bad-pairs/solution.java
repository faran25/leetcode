class Solution {
    public long countBadPairs(int[] nums) {
        long ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            curr=nums[i]-i;
            if(map.containsKey(curr))
            {
                int count=map.get(curr);
                ans+=i-count;
                map.put(curr,map.get(curr)+1);
            }
            else
            {
                ans+=i;
                map.put(curr,1);
            }
        }
        return ans;
    }
}
/*
j-i!=nj-ni
ni-i!=nj-j
*/
