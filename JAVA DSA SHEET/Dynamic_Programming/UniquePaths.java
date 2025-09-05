package Dynamic_Programming;

public class UniquePaths {

    // Memoization way
    public static int uniquePathsMemo(int m, int n) {
        Integer arr[][] = new Integer[m][n];
        return solveMemo(0, 0, m, n, arr);
    }

    static int solveMemo(int i, int j, int m, int n, Integer arr[][]) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i < 0 || i >= m || j < 0 || j >= n) return 0;
        if (arr[i][j] != null) return arr[i][j];
        int right = solveMemo(i, j + 1, m, n, arr);
        int down = solveMemo(i + 1, j, m, n, arr);
        return arr[i][j] = right + down;
    }

    /*
    Classic recursion way
    public static int uniquePathsRec(int m, int n) {
        return solveRec(0, 0, m, n);
    }

    static int solveRec(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i < 0 || i >= m || j < 0 || j >= n) return 0;
        int right = solveRec(i, j + 1, m, n);
        int down = solveRec(i + 1, j, m, n);
        return right + down;
    }
    */

    public static void main(String[] args) {
        int m = 3, n = 7;
        int result = uniquePathsMemo(m, n);
        System.out.println(result);

        //System.out.println(uniquePathsRec(m, n));   for classic recursive way
    }
}