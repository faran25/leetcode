class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans=0;
        int i=0;
        int j=skill.length-1;
        int sum=skill[i]+skill[j];
        while(i<j)
        {
            int temp=skill[i]+skill[j];
            if(temp!=sum) return -1;
            ans=ans+skill[i]*skill[j];
            i++;
            j--;
        }
        return ans;
    }
}
