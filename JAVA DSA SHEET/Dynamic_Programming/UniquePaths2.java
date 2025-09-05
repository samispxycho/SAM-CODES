package Dynamic_Programming;

public class UniquePaths2 {

    // Memoization way
    public static int uniquePathsWithObstaclesMemo(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        Integer arr[][] = new Integer[m][n];
        return solveMemo(0, 0, m, n, obstacleGrid, arr);
    }

    static int solveMemo(int i, int j, int m, int n, int[][] obstacleGrid, Integer arr[][]) {
        if (i < 0 || i >= m || j < 0 || j >= n) return 0;
        if (obstacleGrid[i][j] == 1) return 0;
        if (arr[i][j] != null) return arr[i][j];
        if (i == m - 1 && j == n - 1) return 1;

        int right = solveMemo(i, j + 1, m, n, obstacleGrid, arr);
        int down = solveMemo(i + 1, j, m, n, obstacleGrid, arr);

        return arr[i][j] = right + down;
    }

    /*
    Classic recursion way
    public static int uniquePathsWithObstaclesRec(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return solveRec(0, 0, m, n, obstacleGrid);
    }

    static int solveRec(int i, int j, int m, int n, int[][] obstacleGrid) {
        if (i < 0 || i >= m || j < 0 || j >= n) return 0;
        if (obstacleGrid[i][j] == 1) return 0;
        if (i == m - 1 && j == n - 1) return 1;

        int right = solveRec(i, j + 1, m, n, obstacleGrid);
        int down = solveRec(i + 1, j, m, n, obstacleGrid);

        return right + down;
    }
    */

    public static void main(String[] args) {
        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        int result = uniquePathsWithObstaclesMemo(obstacleGrid);
        System.out.println(result);

        //System.out.println(uniquePathsWithObstaclesRec(obstacleGrid));   for classic recursive way
    }
}