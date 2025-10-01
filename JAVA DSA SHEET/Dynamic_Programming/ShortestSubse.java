package Dynamic_Programming;

public class ShortestSubse {

    // Memoization way
    public static int shortestCommonSupersequence(String s1, String s2) {
        Integer dp[][] = new Integer[s1.length()][s2.length()];
        return solveMemo(s1, s2, 0, 0, dp);
    }

    static int solveMemo(String s1, String s2, int i, int j, Integer dp[][]) {
        if (i == s1.length()) return s2.length() - j;
        if (j == s2.length()) return s1.length() - i;

        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + solveMemo(s1, s2, i + 1, j + 1, dp);
        }

        return dp[i][j] = 1 + Math.min(solveMemo(s1, s2, i + 1, j, dp), solveMemo(s1, s2, i, j + 1, dp));
    }

    /*
    // Classic recursion way
    public static int shortestCommonSupersequenceRec(String s1, String s2) {
        return solveRec(s1, s2, 0, 0);
    }

    static int solveRec(String s1, String s2, int i, int j) {
        if (i == s1.length()) return s2.length() - j;
        if (j == s2.length()) return s1.length() - i;

        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + solveRec(s1, s2, i + 1, j + 1);
        }

        return 1 + Math.min(solveRec(s1, s2, i + 1, j), solveRec(s1, s2, i, j + 1));
    }
    */

    public static void main(String[] args) {
        String s1 = "abac";
        String s2 = "cab";
        int result = shortestCommonSupersequence(s1, s2);
        System.out.println(result);

        // System.out.println(shortestCommonSupersequenceRec(s1, s2));  // For classic recursion
    }
}