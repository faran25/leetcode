class Solution {
    public boolean detectCapitalUse(String word) {
        String upper=word.toUpperCase();
        String lower=word.toLowerCase();
        if (word.equals(upper)) return true;
        else if(word.equals(lower)) return true;
        else 
        {
            if(word.charAt(0)==upper.charAt(0) && 
            word.substring(1,word.length()).equals(upper.substring(1,word.length()))) return true;
            else if(word.charAt(0)!=lower.charAt(0) && 
            word.substring(1,word.length()).equals(lower.substring(1,word.length()))) return true;
            return false;
        }
    }
}
