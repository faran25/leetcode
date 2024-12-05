/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int binarySearch(int target, MountainArray mountainArr, int[] arr, int l, int r)
    {
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(arr[mid]==-1)
            {
                arr[mid]=mountainArr.get(mid);
            }
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            } 
        }
        return -1;
    }

    public int binarySearchDecreasing(int target, MountainArray mountainArr, int[] arr, int l, int r)
    {
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(arr[mid]==-1)
            {
                arr[mid]=mountainArr.get(mid);
            }
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            } 
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
        int n=mountainArr.length();
        int r=n-1;
        int []arr=new int[n];
        Arrays.fill(arr,-1);
        int mid=0;
        int peak=0;
        while(l<r)
        {
            mid=l+(r-l)/2;
            if(arr[mid]==-1)
            arr[mid]=mountainArr.get(mid);
            if(arr[mid+1]==-1)
            arr[mid+1]=mountainArr.get(mid+1);
            if(arr[mid]<arr[mid+1])
            {
                l=mid+1;
                peak=l;
            }
            else
            {
                r=mid;
            }
        }
        int ans=binarySearch(target, mountainArr, arr, 0, peak);
        if(ans!=-1) return ans;
        else return binarySearchDecreasing(target, mountainArr, arr, peak+1, n-1);
    }
}
