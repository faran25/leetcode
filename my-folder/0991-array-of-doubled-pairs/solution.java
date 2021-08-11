class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        HashMap<Integer, Integer> map=new HashMap();
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                odd++;
            }
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }else
            {
                map.put(arr[i],1);
            }
        }
        if(odd%2==1) return false;
        
        Arrays.sort(arr);
        if(map.containsKey(0))
        {
            if(map.get(0)%2==1)
            {
                return false;
            }
            else
            {
                map.remove(0);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                if(map.containsKey(2*arr[i]))
                {
                    if(map.get(arr[i])==1)
                    {
                        map.remove(arr[i]);
                        
                    }else
                    {
                        map.put(arr[i],map.get(arr[i])-1);
                    }
                    
                    
                    if(map.get(2*arr[i])==1)
                        
                        
                    {
                        map.remove(2*arr[i]);
                        
                    }else
                    {
                        map.put(2*arr[i],map.get(2*arr[i])-1);
                    }
                }
            }
        }
        
        if(map.size()>0) return false;
        
        
        return true;
        
    }
}
