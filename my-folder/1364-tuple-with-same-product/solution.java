class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int prod=nums[i]*nums[j];
                if(map.containsKey(prod))
                {
                    map.put(prod,map.get(prod)+1);
                }
                else
                {
                    map.put(prod,1);
                }
            }
        }
        for(Integer key:map.keySet())
        {
            int value=map.get(key);
            if(value==2)
            {
                count++;
            }
            else if(map.get(key)>2)
            {
                int k=value*(value-1)/2;
                count+=k;
            }
        }
        return 8*count;
    }
}
