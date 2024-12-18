class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(n==1 && flowerbed[0]==0 && flowerbed.length==1) return true;
        if(flowerbed.length==n) return false;

        int i=1;
        int k=flowerbed.length-1;
        if(flowerbed[0]==0 && flowerbed[1]==0) 
        {
            flowerbed[0]=1;
            n--;
        }
        while(n>0 && i<k)
        {
            if(flowerbed[i]==1)
            {
                i=i+2;
                continue;
            }
            if(flowerbed[i]==0 )
            {
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    n--;
                    flowerbed[i]=1;
                    i=i+2;
                    continue;
                }
                if(flowerbed[i-1]==1)
                {
                    i++;
                    continue;
                }
            }  
            i++;
        }
        if(flowerbed[k]==0 && flowerbed[k-1]==0) 
        {
            n--;
            flowerbed[k]=0;
        }
        if(n<=0) return true;
        return false;
    }
}
