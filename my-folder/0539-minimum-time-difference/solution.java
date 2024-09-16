class Solution {
    private int func(String s1,String s2)
    {
        //int ans= Math.abs(Integer.parseInt(s2.substring(0,2))*60+Integer.parseInt(s2.substring(3,5)) -
        //Integer.parseInt(s1.substring(0,2))*60+Integer.parseInt(s1.substring(3,5)));
        int a=((s2.charAt(0)-'0')*10+s2.charAt(1)-'0')*60+(s2.charAt(3)-'0')*10+s2.charAt(4)-'0';
        int b=((s1.charAt(0)-'0')*10+s1.charAt(1)-'0')*60+(s1.charAt(3)-'0')*10+s1.charAt(4)-'0';
        int ans=b-a;
        if(a>b)
        {
            ans=a-b;
        }
        
        if(ans>720)
        {
            ans=1440-ans;
        }
        return ans;
    }
    public int findMinDifference(List<String> tp) {
        
        Collections.sort(tp);
        int ans=func(tp.get(0),tp.get(tp.size()-1));
        for(int i=1;i<tp.size();i++)
        {
            int temp=func(tp.get(i),tp.get(i-1));
            if(temp<ans)
            {
                ans=temp;
            }
        }
        return ans;
    }
}
