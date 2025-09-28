package Dynamic_Programming;

//Longest Pallindromic subsequence can be solved using 2 ways..First way is creating a second string which is the reverse
//of the original string and then calculating the longest common subsequence of it and second is using i and j pointer in 
//the same string...THIS IS METHOD 2

public class LongestPallinS2 {

    // Recursive approach
    /*
    int solveRecursive(String s, int i, int j) {
        if (i > j) return 0;
        if (i == j) return 1;

        if (s.charAt(i) == s.charAt(j)) {
            return 2 + solveRecursive(s, i + 1, j - 1);
        }

        return Math.max(solveRecursive(s, i + 1, j), solveRecursive(s, i, j - 1));
    }
    */

    // Memoized approach
    int solveMemo(String s, int i, int j, Integer dp[][]) {
        if (i > j) return 0;
        if (i == j) return 1;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + solveMemo(s, i + 1, j - 1, dp);
        }

        return dp[i][j] = Math.max(solveMemo(s, i + 1, j, dp), solveMemo(s, i, j - 1, dp));
    }

    public int longestPalindromeSubseq(String s) {
        Integer dp[][] = new Integer[1001][1001];
        return solveMemo(s, 0, s.length() - 1, dp);
    }

    public static void main(String[] args) {
        String s = "bbbab";

        LongestPallinS2 obj = new LongestPallinS2();

        // Recursive version
        // int result = obj.solveRecursive(s, 0, s.length() - 1);

        // Memoized version
        int result = obj.longestPalindromeSubseq(s);

        System.out.println("Longest Palindromic Subsequence length: " + result);
    }
}