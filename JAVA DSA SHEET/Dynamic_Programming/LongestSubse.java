package Dynamic_Programming;

public class LongestSubse {

    // Recursive approach
    /*
    int solveRecursive(String text1, String text2, int i, int j) {
        if (i >= text1.length() || j >= text2.length()) return 0;

        if (text1.charAt(i) == text2.charAt(j)) {
            return 1 + solveRecursive(text1, text2, i + 1, j + 1);
        }

        return Math.max(solveRecursive(text1, text2, i + 1, j), solveRecursive(text1, text2, i, j + 1));
    }
    */

    // Memoized approach
    int solveMemo(String text1, String text2, int i, int j, Integer dp[][]) {
        if (i >= text1.length() || j >= text2.length()) return 0;

        if (dp[i][j] != null) return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + solveMemo(text1, text2, i + 1, j + 1, dp);
        }

        return dp[i][j] = Math.max(solveMemo(text1, text2, i + 1, j, dp), solveMemo(text1, text2, i, j + 1, dp));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] = new Integer[text1.length()][text2.length()];
        return solveMemo(text1, text2, 0, 0, dp);
    }

    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";

        LongestSubse obj = new LongestSubse();

        // Recursive version
        // int result = obj.solveRecursive(text1, text2, 0, 0);

        // Memoized version
        int result = obj.longestCommonSubsequence(text1, text2);

        System.out.println("Longest Common Subsequence length: " + result);
    }
}