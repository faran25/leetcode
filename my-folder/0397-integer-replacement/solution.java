class Solution {
    HashMap <Integer,Integer> map;
    public int func(int n)
    {
        if(n==1) return 0;
        else if(map.containsKey(n)) return map.get(n);
        if(n%2==0) 
        {
            map.put(n,1+func(n/2));
        }
        else
        {
            map.put(n,2+(Math.min(func(n/2),func((n/2)+1)))); // +1 for even , +1 for half
        }
        return map.get(n);
    }
    public int integerReplacement(int n) {
        if(n==1) return 0;
        else if(n==2) return 1; 
        
        map=new HashMap<>();
        return func(n);
    }
}
