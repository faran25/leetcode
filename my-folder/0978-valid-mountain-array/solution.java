class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=1;
        while(i<arr.length && arr[i-1]<arr[i])
        {
            if(arr[i-1]>=arr[i]) return false;
            i++;
        }
        if((i<arr.length && arr[i-1]==arr[i]) || i==arr.length || (i==1 && arr[i-1]>arr[i])) return false;
        //System.out.println(i);
        while(i<arr.length-1)
        {
            if(arr[i]<=arr[i+1]) return false;
            i++;
        }
        return true;
    }
}
