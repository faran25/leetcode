class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        
        def backtrack(binaryArray, ind, result, numsSet):
            # basecase 
            if ind == len(binaryArray):
                num = ''.join(binaryArray)
                if num not in numsSet:
                    result.append(num)
                return
            
            if len(result) > 0:
                return
            
            backtrack(binaryArray, ind+1, result, numsSet)
            
            # do
            binaryArray[ind] = '1'
            backtrack(binaryArray, ind+1, result, numsSet)
            
            # undo
            binaryArray[ind] = '0'

        
        n = len(nums[0])
        result = []
        binaryArray = ['0'] * n
        numsSet = set(nums)
        backtrack(binaryArray, 0, result, numsSet)
        return result[0]




