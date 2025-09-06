package Dynamic_Programming;

import java.util.*;

public class Triangle {

    // Memoization way
    public static int minimumTotalMemo(List<List<Integer>> triangle) {
        int m = triangle.size();
        Integer arr[][] = new Integer[m][m];
        return solveMemo(0, 0, triangle, arr);
    }

    static int solveMemo(int i, int j, List<List<Integer>> triangle, Integer arr[][]) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        if (arr[i][j] != null) return arr[i][j];

        int leftD = triangle.get(i).get(j) + solveMemo(i + 1, j, triangle, arr);
        int rightD = triangle.get(i).get(j) + solveMemo(i + 1, j + 1, triangle, arr);

        return arr[i][j] = Math.min(leftD, rightD);
    }

    /*
    Classic recursion way
    public static int minimumTotalRec(List<List<Integer>> triangle) {
        return solveRec(0, 0, triangle);
    }

    static int solveRec(int i, int j, List<List<Integer>> triangle) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);

        int leftD = triangle.get(i).get(j) + solveRec(i + 1, j, triangle);
        int rightD = triangle.get(i).get(j) + solveRec(i + 1, j + 1, triangle);

        return Math.min(leftD, rightD);
    }
    */

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        int result = minimumTotalMemo(triangle);
        System.out.println(result);

        //System.out.println(minimumTotalRec(triangle));   for classic recursive way
    }
}