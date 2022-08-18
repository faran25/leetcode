class Solution {
    public List<Integer> majorityElement(int[] A) {
        
        int max1=A[0];
        int max2=Integer.MIN_VALUE;

        int count1=1;
        int count2=0;

        for(int i=1;i<A.length;i++)
        {
            if(A[i]==max1) count1++;
            else if(A[i]==max2) count2++;
            else if(count1==0) 
            {
                max1=A[i];
                count1=1;
            }
            else if(count2==0) 
            {
                max2=A[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }

        }
        count1=0;
        count2=0;
        for(int i=0;i<A.length;i++)
        {
            if(max1==A[i]) count1++;
            else if(max2==A[i]) count2++;
        }
        List <Integer> ans=new ArrayList<>();
        if(count1>A.length/3 && count2>A.length/3) 
        {
            ans.add(max1);
            ans.add(max2);
        }
        else if(count1>A.length/3) ans.add(max1);
        else if(count2>A.length/3) ans.add(max2);
        
        return ans;
        
        
    }
}
