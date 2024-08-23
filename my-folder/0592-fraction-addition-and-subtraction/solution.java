class Solution {
    public String fractionAddition(String e) {
        
        List<Integer> num=new ArrayList<>();
        List<Integer> den=new ArrayList<>();
        int i=0;
        int k=1;
        while(i<e.length())
        {
            k=1;
            if(e.charAt(i)=='-')
            {
                k=-1;
                i++;
            }
            else if(e.charAt(i)=='+') i++;
            int index=i;
            while(i<e.length())
            {
                if(e.charAt(i)=='/')
                {
                    break;
                }
                i++;
            }
            k=k*Integer.parseInt(e.substring(index,i));
            num.add(k);
            i++;
            index=i;
            while(i<e.length())
            {
                if(e.charAt(i)=='+' || e.charAt(i)=='-')
                {
                    break;
                }
                i++;
            }
            k=Integer.parseInt(e.substring(index,i));
            den.add(k);
        }
        int lcm=den.get(0);
        int gcd=den.get(0);
        for(int j=1;j<den.size();j++)
        {
            lcm=lcm*den.get(j);
            gcd=HCF(gcd,den.get(j));
        }
        if(den.size()>1)
        lcm=lcm/gcd;
        int sum=0;
        for(int j=0;j<num.size();j++)
        {
            sum=sum+(lcm/den.get(j))*num.get(j);
        }
        if(sum==0) return "0/1";
        k=1;
        
        if(sum<0) 
        {
            k=-1;
            sum=sum*k;
        }
        int hcf=HCF(sum,lcm);
        lcm=lcm/hcf;
        sum=sum/hcf;
        String ans="";
        if(k<0)
        {
            ans="-"+sum+"/"+lcm;
            return ans;
        }
        ans=sum+"/"+lcm;
        return ans;
    }

    private int HCF(int a, int b)
    {
        if(a==0 || b==0) return a+b;

        return HCF(b%a,a);
    }
    private int LCM(int a,int b)
    {
        return a*b/HCF(a,b);
    }
}
