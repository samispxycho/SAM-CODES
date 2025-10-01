package Dynamic_Programming;

public class EditDistance {

    // Memoization way
    public static int minDistanceMemo(String word1, String word2) {
        Integer dp[][] = new Integer[word1.length()][word2.length()];
        return solveMemo(word1, word2, 0, 0, dp);
    }

    static int solveMemo(String s1, String s2, int i, int j, Integer dp[][]) {
        if (i == s1.length()) return s2.length() - j;
        if (j == s2.length()) return s1.length() - i;

        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return solveMemo(s1, s2, i + 1, j + 1, dp);
        }

        int insert = solveMemo(s1, s2, i, j + 1, dp);
        int delete = solveMemo(s1, s2, i + 1, j, dp);
        int replace = solveMemo(s1, s2, i + 1, j + 1, dp);

        return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
    }

    /*
    // Classic recursion way
    public static int minDistanceRec(String word1, String word2) {
        return solveRec(word1, word2, 0, 0);
    }

    static int solveRec(String s1, String s2, int i, int j) {
        if (i == s1.length()) return s2.length() - j;
        if (j == s2.length()) return s1.length() - i;

        if (s1.charAt(i) == s2.charAt(j)) {
            return solveRec(s1, s2, i + 1, j + 1);
        }

        int insert = solveRec(s1, s2, i, j + 1);
        int delete = solveRec(s1, s2, i + 1, j);
        int replace = solveRec(s1, s2, i + 1, j + 1);

        return 1 + Math.min(insert, Math.min(delete, replace));
    }
    */

    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        int result = minDistanceMemo(word1, word2);
        System.out.println(result);

        //System.out.println(minDistanceRec(word1, word2));  // for classic recursive way
    }
}