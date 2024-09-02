class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        //Long sum=Arrays.stream(chalk).mapToLong(i -> i).sum();
        long sum=0l;
        for(int i=0;i<chalk.length;i++)
        {
            sum+=chalk[i];
        }
        //if(k>sum);
        k=(int)(k%sum);
        int i=0;
        while(i<chalk.length)
        {
            if(k<chalk[i]) return i;
            k=k-chalk[i];
            i++;
        }
        return 0;

    }
}
