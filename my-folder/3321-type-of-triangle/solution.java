class Solution {
    public boolean valid(int a, int b , int c)
    {
        if(a < b+c && b < a+c && c < a+b) return true;
        return false;
    }
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(!valid(a,b,c)) return "none";
        if(a==b && b==c) return "equilateral";
        if(a==b || b==c || a==c) return "isosceles";
        return "scalene";
    }
}
