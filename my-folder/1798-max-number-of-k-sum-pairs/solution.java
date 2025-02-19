class Solution {
    public int maxOperations(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0)
            {
                ans++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }
            else if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        return ans;
        
    }
}
