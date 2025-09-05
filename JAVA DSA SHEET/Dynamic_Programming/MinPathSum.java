package Dynamic_Programming;

public class MinPathSum {

    // Memoization way
    public static int minPathSumMemo(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer arr[][] = new Integer[m][n];
        return solveMemo(0, 0, m, n, grid, arr);
    }

    static int solveMemo(int i, int j, int m, int n, int[][] grid, Integer arr[][]) {
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (i < 0 || i >= m || j < 0 || j >= n) return (int) 1e9;
        if (arr[i][j] != null) return arr[i][j];
        int right = grid[i][j] + solveMemo(i, j + 1, m, n, grid, arr);
        int down = grid[i][j] + solveMemo(i + 1, j, m, n, grid, arr);
        return arr[i][j] = Math.min(right, down);
    }

    /*
    Classic recursion way
    public static int minPathSumRec(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return solveRec(0, 0, m, n, grid);
    }

    static int solveRec(int i, int j, int m, int n, int[][] grid) {
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (i >= m || j >= n) return (int) 1e9;
        int right = grid[i][j] + solveRec(i, j + 1, m, n, grid);
        int down = grid[i][j] + solveRec(i + 1, j, m, n, grid);
        return Math.min(right, down);
    }
    */

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int result = minPathSumMemo(grid);
        System.out.println(result);

        //System.out.println(minPathSumRec(grid));   for classic recursive way
    }
}