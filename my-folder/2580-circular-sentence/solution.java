class Solution {
    public boolean isCircularSentence(String str) {
        //dont do this question, not worth time.
        int i=0;
        char[] sentence=str.toCharArray();
        char f=sentence[0];
        char ch=sentence[0];
        boolean flag=false;
        while(i<sentence.length-1)
        {
            if(sentence[i+1]==' ' && sentence[i]!=' ')
            {
                ch=sentence[i];
                i++;
                break;
            }
            i++;
        }
        if(i==sentence.length-1) 
        {
            if(ch==sentence[i]) return true;
            return false;
        }
        
        while(i<sentence.length-1)
        {
            if(sentence[i-1]==' ' && sentence[i]!=' ' && sentence[i]!=ch)
            {
                return false;
            }
            if(sentence[i-1]!=' ' && sentence[i]==' ')
            {
                flag=true;
                ch=sentence[i-1];
                if(i+1==sentence.length-1)
                {
                    if(ch==sentence[i+1]) return true;
                    else return false;
                }
            }
            i++;
        }
        if(f!=sentence[i]) return false;
        return true;
    }
}
