class Solution {
    public int longestSquareStreak(int[] nums) {

        long ans=-1;
        Arrays.sort(nums);
        HashMap<Long,Long> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i]*1l,1l);
        }
        for(int i=0;i<nums.length;i++)
        {
            long num=1l*nums[i]*nums[i];
            if(map.containsKey(num))
            {
                //System.out.print(num);
                long temp=map.get(nums[i]*1l)+1l;
                map.put(num,temp);
                if(temp>ans) ans=temp;
            }
            else if(map.get(nums[i]*1l)>1l )
            {
                if(map.get(nums[i]*1l)>ans)
                ans=map.get(nums[i]*1l);
            }
        }
        return (int)ans;
    }
}

/*
2,3,4,6,8,16
*/
