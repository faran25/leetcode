class Solution {
    public String largestNumber(int[] nums) {
        Integer [] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            String s1=a.toString();
            String s2=b.toString();
            return (s2 + s1).compareTo(s1 + s2);
        }
        );
        if(arr[0]==0) return "0";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            str.append(arr[i]);
        }
        return str.toString();
    }
}
