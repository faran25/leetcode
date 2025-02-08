class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        for (String w : S.split("\\s")) {
            res.append(' ' + (vowels.contains(w.charAt(0)) ? w : w.substring(1) + w.charAt(0)) + "ma");
            for (j = 0, ++i; j < i; ++j) {
                res.append("a");
            }
        };
        return res.substring(1).toString();
    }
}
