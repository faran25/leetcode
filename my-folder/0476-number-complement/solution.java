class Solution {
    public int findComplement(int num) {
        int not=~num; //this will flip all the 32 bits of a number
        int mask=0;   //we have to find the significant bits in num, 
                    //and do bitwise AND of not and mask
        while(num>0)
        {
            num=num/2;
            mask=mask<<1;
            mask=mask+1;
        }

        return not & mask;

    }
}
