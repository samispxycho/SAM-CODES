package Dynamic_Programming;

//Longest Pallindromic subsequence can be solved using 2 ways..First way is creating a second string which is the reverse
//of the original string and then calculating the longest common subsequence of it and second is using i and j pointer in 
//the same string...THIS IS METHOD 1

public class LongestPallinS1 {

    // Recursive approach
    /*
    int solveRecursive(String s, String s2, int i, int j) {
        if (i >= s.length() || j >= s2.length()) return 0;

        if (s.charAt(i) == s2.charAt(j)) {
            return 1 + solveRecursive(s, s2, i + 1, j + 1);
        }

        return Math.max(solveRecursive(s, s2, i + 1, j), solveRecursive(s, s2, i, j + 1));
    }
    */

    // Memoized approach
    int solveMemo(String s, String s2, int i, int j, Integer dp[][]) {
        if (i >= s.length() || j >= s2.length()) return 0;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + solveMemo(s, s2, i + 1, j + 1, dp);
        }

        return dp[i][j] = Math.max(solveMemo(s, s2, i + 1, j, dp), solveMemo(s, s2, i, j + 1, dp));
    }

    public int longestPalindromeSubseq(String s) {
        Integer dp[][] = new Integer[s.length()][s.length()];
        String s2 = new StringBuilder(s).reverse().toString();
        return solveMemo(s, s2, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s = "bbbab";

        LongestPallinS1 obj = new LongestPallinS1();

        // Recursive version
        // int result = obj.solveRecursive(s, new StringBuilder(s).reverse().toString(), 0, 0);

        // Memoized version
        int result = obj.longestPalindromeSubseq(s);

        System.out.println("Longest Palindromic Subsequence length: " + result);
    }
}