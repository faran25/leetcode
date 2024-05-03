import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        //int sum=Arrays.stream(nums).sum();
        int sum=0;
        for(int i:nums)
        {
            sum=sum+i;
        }
        int n=nums.length;
        return n*(n+1)/2-sum;
    }
}
