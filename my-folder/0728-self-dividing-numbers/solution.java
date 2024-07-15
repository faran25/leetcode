class Solution {
    private boolean func(int num)
    {
        int k=num;
        while(k>0)
        {
            int last = k % 10;
            if(last == 0 || num % last != 0) return false;
            k = k/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=left;i<=right;i++)
        {
            if(func(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}
