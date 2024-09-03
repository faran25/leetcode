class Solution {
    private String convert(String s)
    {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            ans=ans+s.charAt(i)-'0';
        }
        return ans+"";
    }

    public int getLucky(String s, int k) {
        
        StringBuilder sb=new StringBuilder();
        int ans=0;
        //String 
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i)-'a'+1);
        }
        //ans=convert(sb);
        System.out.println(ans);
        s=sb.toString();
        for(int i=0;i<k;i++)
        {
            s=convert(s);
            if(s.length()==1) break;
        }
        return Integer.parseInt(s);
    }
}
