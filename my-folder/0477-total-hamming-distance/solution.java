class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        int num=1;
        for(int i=0;i<32;i++)
        {
            int zero=0;
            int one=0;
            for(int j=0;j<nums.length;j++)
            {
                if((nums[j]&num)==0)
                {
                    zero++;
                }else
                {
                    one++;
                }
            }
            ans +=zero*one;
            num <<=1;
        }
        return ans;
    }
}

/* 
0100
1110
0010
*/
