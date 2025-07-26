package Graphs;

public class Flood_Fill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            dfs(image, sr, sc, color, image[sr][sc]);
        }
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int color, int value) {
        if (sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1)
            return;
        if (image[sr][sc] != value)
            return;

        image[sr][sc] = color;
        dfs(image, sr - 1, sc, color, value);
        dfs(image, sr + 1, sc, color, value);
        dfs(image, sr, sc - 1, color, value);
        dfs(image, sr, sc + 1, color, value);
    }

    public static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(image, sr, sc, color);

        printImage(image);
    }
}
