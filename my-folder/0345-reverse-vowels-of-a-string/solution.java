class Solution {
    public String reverseVowels(String s) {
        char [] arr=s.toCharArray();

        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(!(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'|| 
                arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'))
            {
                i++;
            }else if(!(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || 
                    arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U'))
            {
                j--;
            }
            else
            {
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
        }
        StringBuilder sb=new StringBuilder();

        for(i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
