class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int xor=0;
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            xor=xor^nums[i-1];
            xor=xor^i;
        }
        int bitNumber=0;
        while((xor&(1<<bitNumber))==0)
        {
            bitNumber++;
        }
        int zero=0;
        int one=0;
        for(int i=1;i<=n;i++)
        {
                if((nums[i-1]&(1<<bitNumber))==0)
                {
                    zero=zero^nums[i-1];
                }
                else
                {
                    one=one^nums[i-1];
                }

                if((i&(1<<bitNumber))==0)
                {
                    zero=zero^i;
                }
                else
                {
                    one=one^i;
                }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==zero)
            {
                count++;
            }
        }
        if (count == 2) {
            ans[0]=zero;
            ans[1]=one;
        } else {
            ans[0]=one;
            ans[1]=zero;
        }
        return ans;   
    }
}

/*
This code aims to find the missing and duplicate numbers in an array of integers nums. Here's a breakdown of how it works:

Initialization:
Initialize variables n to store the length of the array nums and xor to 0.
XOR Operation:
Iterate over the array nums from index 1 to n.
Calculate the XOR of each element in nums and its corresponding index (i) from 1 to n. Store the result in xor. This helps identify the missing and duplicate numbers.
Finding the Bit Position:
Find the position of the rightmost set bit in the XOR result xor. This position represents the differing bit between the missing and duplicate numbers.
Partitioning Elements:
Partition the elements of nums and the indices from 1 to n into two groups based on the bit at the position found in step 3.
XOR the elements in each group to find the missing and duplicate numbers.
Counting Occurrences:
Count the occurrences of the found missing number (zeroCrew) in the array nums.
Output:
If the count is 2, return the array containing the missing and duplicate numbers as [zeroCrew, oneCrew].
Otherwise, return the array containing the missing and duplicate numbers as [oneCrew, zeroCrew].
Overall, this approach efficiently identifies the missing and duplicate numbers in the array nums using bitwise operations and XOR. It ensures linear time complexity, making it an optimal solution for this problem.
 */
