class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int max=1;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]-difference))
            {
                int len=map.get(arr[i]-difference)+1;
                map.put(arr[i],len);
                if(len>max) max=len;
            }else
            {
                map.put(arr[i],1);
            }
        }
        return max;
    }
}
