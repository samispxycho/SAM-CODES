package Dynamic_Programming;

public class FallingPathSum {

    static int ROWS;
    static int COLS;

    // Memoization way
    static Integer arr[][];

    public static int minFallingPathSumMemo(int[][] matrix) {
        ROWS = matrix.length;
        COLS = matrix[0].length;
        arr = new Integer[ROWS][COLS];

        int result = Integer.MAX_VALUE;
        for (int j = 0; j < COLS; j++) {
            int d = solveMemo(0, j, matrix);
            result = Math.min(result, d);
        }
        return result;
    }

    static int solveMemo(int i, int j, int matrix[][]) {
        if (!(i >= 0 && i < ROWS && j >= 0 && j < COLS)) return (int) 1e9;
        if (i == ROWS - 1) return matrix[i][j];
        if (arr[i][j] != null) return arr[i][j];

        int leftD = solveMemo(i + 1, j - 1, matrix);
        int down = solveMemo(i + 1, j, matrix);
        int rightD = solveMemo(i + 1, j + 1, matrix);

        return arr[i][j] = matrix[i][j] + Math.min(leftD, Math.min(down, rightD));
    }

    /*
    Classic recursion way
    public static int minFallingPathSumRec(int[][] matrix) {
        ROWS = matrix.length;
        COLS = matrix[0].length;

        int result = Integer.MAX_VALUE;
        for (int j = 0; j < COLS; j++) {
            int d = solveRec(0, j, matrix);
            result = Math.min(result, d);
        }
        return result;
    }

    static int solveRec(int i, int j, int matrix[][]) {
        if (!(i >= 0 && i < ROWS && j >= 0 && j < COLS)) return (int) 1e9;
        if (i == ROWS - 1) return matrix[i][j];

        int leftD = solveRec(i + 1, j - 1, matrix);
        int down = solveRec(i + 1, j, matrix);
        int rightD = solveRec(i + 1, j + 1, matrix);

        return matrix[i][j] + Math.min(leftD, Math.min(down, rightD));
    }
    */

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 1, 3},
            {6, 5, 4},
            {7, 8, 9}
        };

        int result = minFallingPathSumMemo(matrix);
        System.out.println(result);

        //System.out.println(minFallingPathSumRec(matrix));   for classic recursive way
    }
}