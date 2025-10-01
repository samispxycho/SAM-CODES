package Dynamic_Programming;

public class MinStepsPallin {

    // Memoization way
    public static int minInsertionsMemo(String s) {
        Integer dp[][] = new Integer[s.length()][s.length()];
        return solveMemo(s, 0, s.length() - 1, dp);
    }

    static int solveMemo(String s, int i, int j, Integer dp[][]) {
        if (i > j) return 0;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            return solveMemo(s, i + 1, j - 1, dp);
        }

        int first = 1 + solveMemo(s, i + 1, j, dp);
        int second = 1 + solveMemo(s, i, j - 1, dp);

        return dp[i][j] = Math.min(first, second);
    }

    /*
    // Classic recursion way
    public static int minInsertionsRec(String s) {
        return solveRec(s, 0, s.length() - 1);
    }

    static int solveRec(String s, int i, int j) {
        if (i > j) return 0;

        if (s.charAt(i) == s.charAt(j)) {
            return solveRec(s, i + 1, j - 1);
        }

        int first = 1 + solveRec(s, i + 1, j);
        int second = 1 + solveRec(s, i, j - 1);

        return Math.min(first, second);
    }
    */

    public static void main(String[] args) {
        String s = "leetcode";
        int result = minInsertionsMemo(s);
        System.out.println(result);

        // System.out.println(minInsertionsRec(s)); // for classic recursive way
    }
}