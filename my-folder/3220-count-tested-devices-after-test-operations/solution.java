class Solution {
    public int countTestedDevices(int[] arr) {
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>count)
            {
                count++;
            }
        }
        return count;
    }
}
