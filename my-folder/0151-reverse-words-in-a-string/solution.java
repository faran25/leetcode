class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");

        StringBuilder sb= new StringBuilder();
        sb.append(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            sb.insert(0,arr[i]+" ");
        }
        return sb.toString();
    }
}
