import java.util.*;
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans=0;
        int [] last=new int[10];
        for(int i=1;i<nums.length;i++)
        {
            last[nums[i]%10]++;
            
        }
        //last[nums[0]%10]--;
        for(int i=0;i<nums.length-1;i++)
        {
            int k=nums[i];
            while(k>9)
            {
                k=k/10;
            }
            for(int j=1;j<last.length;j++)
            {
                if(last[j]>0 && gcd(k,j))
                {
                    ans=ans+last[j];
                    //System.out.println(first[i]+" "+j+" "+last[j]+" "+ans);
                }
            }
            last[nums[i+1]%10]--;
        }
        return ans;
    }
    
    public static boolean gcd(int a, int b)
    {
        if(a==0||b==0) return false;
        if(a==1 || b==1) return true;
        return gcd(b,a%b);
    }
}
