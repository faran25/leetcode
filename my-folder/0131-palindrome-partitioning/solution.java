class Solution {
    public List<List<String>> partition(String s) {
        // Backtracking
        // Edge case
        if(s == null || s.length() == 0) return new ArrayList<>();
        
        List<List<String>> result = new ArrayList<>();
        helper(s, new ArrayList<>(), result);
        return result;
    }
    public void helper(String s, List<String> step, List<List<String>> result) {
        // Base case
        if(s == null || s.length() == 0) {
            result.add(new ArrayList<>(step));
            return;
        }
        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue; // only do backtracking when current string is palindrome
            
            step.add(temp);  // Do
            helper(s.substring(i, s.length()), step, result); // call recursive function
            step.remove(step.size() - 1); // undo
        }
        return;
    }
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right --;
        }
        return true;
    }
    /*
    public List<List<String>> partition(String s) {
        int n=s.length();
        boolean [][] dp=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                {
                    dp[i][j]=true;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dp[i][j])
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
            }
            System.out.println();
        }
        return null;
    }*/
}
/**
1 1 0
0 1 0
0 0 1
 */
