class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            if(set.contains(num*2) || ((num&1)==0 && set.contains(num/2)) ) return true;
            set.add(num);
        }
        return false;
    }
}
