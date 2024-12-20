class Solution {
    public List<Integer> findDuplicates(int[] nums) {
 int n=nums.length;
        List<Integer> list=new ArrayList<>();
        if(n==1) return list;
        
        for(int i=0;i<n;i++)
        {
            int k = Math.abs(nums[i])-1;

            if (nums[k] > 0) {
                nums[k] *= -1;
            } else {
                list.add(Math.abs(nums[i]));
            }
                        
        }
        return list;
    }
}

// // 4,3,2,7,8,2,3,1

// 1 2
// 3 1 2 4 1 2
// 15 13 8 10 0
// /** */

// -3 -1 -2 -4 1 2

// 1 - n
// 1 - 6 -> [0 - 5]
