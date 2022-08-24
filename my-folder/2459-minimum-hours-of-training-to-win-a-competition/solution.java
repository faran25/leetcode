class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        
        int sume=0;
        int sum=0;
        int ans=0;
        
        for(int i=0;i<energy.length;i++)
        {
            sume=sume+energy[i];
            if(initialExperience <= experience[i] ) 
            {
                ans=Math.max(ans,experience[i]-initialExperience+1);
                
                
            }
            initialExperience +=experience[i];
            
            //System.out.println(experience[i]+" "+initialExperience+" "+ans);
        }
       if(sume>=initialEnergy)
        ans=ans+sume-initialEnergy+1;
        return ans;
        
    }
}
