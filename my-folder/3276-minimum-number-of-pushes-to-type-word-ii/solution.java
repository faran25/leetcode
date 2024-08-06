import java.util.Collections;
class Solution {
    public int minimumPushes(String word) {
        Integer[] freq=new Integer[26];
        Arrays.fill(freq,0);

        for(int i=0;i<word.length();i++)
        {
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq, Collections.reverseOrder());
        //System.out.println(Arrays.toString(freq));
        int ans=0;
        int k=0;
        for(int i=0;i<26;i++)
        {
            //if(i%8==0)k++;
            ans +=(i/8+1)*freq[i];
        }
        /*for(int i=8;i<16;i++)
        {
            ans+=2*freq[i];
        }
        for(int i=16;i<24;i++)
        {
            ans+=3*freq[i];
        }
        for(int i=24;i<26;i++)
        {
            ans+=4*freq[i];
        }*/
        return ans;
    }
}
