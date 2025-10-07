package Dynamic_Programming;

public class ValidParenString {

    // Memoization way
    public static boolean checkValidStringMemo(String s) {
        Boolean dp[][] = new Boolean[s.length()][s.length()];
        return solveMemo(s, 0, 0, dp);
    }

    static boolean solveMemo(String s, int index, int count, Boolean dp[][]) {
        if (count < 0) return false;
        if (index == s.length()) return count == 0;

        if (dp[index][count] != null) return dp[index][count];

        if (s.charAt(index) == '(') {
            return solveMemo(s, index + 1, count + 1, dp);
        } else if (s.charAt(index) == ')') {
            return solveMemo(s, index + 1, count - 1, dp);
        } else {
            return dp[index][count] = solveMemo(s, index + 1, count + 1, dp)
                    || solveMemo(s, index + 1, count - 1, dp)
                    || solveMemo(s, index + 1, count, dp);
        }
    }

    /*
    // Classic recursion way
    public static boolean checkValidStringRec(String s) {
        return solveRec(s, 0, 0);
    }

    static boolean solveRec(String s, int index, int count) {
        if (count < 0) return false;
        if (index == s.length()) return count == 0;

        if (s.charAt(index) == '(') {
            return solveRec(s, index + 1, count + 1);
        } else if (s.charAt(index) == ')') {
            return solveRec(s, index + 1, count - 1);
        } else {
            return solveRec(s, index + 1, count + 1)
                    || solveRec(s, index + 1, count - 1)
                    || solveRec(s, index + 1, count);
        }
    }
    */

    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidStringMemo(s));  // using memoization
        // System.out.println(checkValidStringRec(s)); // for classic recursion
    }
}