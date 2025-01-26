class Solution {
    
    public int lengthOfLongestSubstring(String A) {
        int len=0;
        int max=0;
        int a=0;
        HashMap <Character, Integer> map=new HashMap();
        for(int i=0;i<A.length();i++)
        {
             if(!map.containsKey(A.charAt(i)))
             {
                 map.put(A.charAt(i),i);
                 len++;
             }
             else
             {
                 if(len>max) max=len;
                 int k=map.get(A.charAt(i));
                 
                 while(a<k)
                 {
                     if(map.containsKey(A.charAt(a)))
                     {
                         if(map.get(A.charAt(a))==a)
                         {
                             map.remove(A.charAt(a));
                         }
                         a++;
                     }
                 }
                 len=i-k; //System.out.println(len+" "+map.get(A.charAt(i)));
                 map.put(A.charAt(i),i);
             }
        }
        if(len>max) max=len;
        return max;
    }
}

        

