package Graphs;

public class Num_of_Province {

    public void dfs(int node, int[] visited, int[][] isConnected) {

        if(visited[node]==1)return;

        visited[node] = 1;
        for (int i = 0; i < isConnected[node].length; i++) {
            if (isConnected[node][i] == 1) {
                dfs(i, visited, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int len = isConnected.length;
        int visited[] = new int[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (visited[i] == 0) {
                count += 1;
                dfs(i, visited, isConnected);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int isConnected[][]={
            {0,1,0},
            {1,0,0},
            {0,0,0}
        };

        Num_of_Province obj = new Num_of_Province();
        int count=obj.findCircleNum(isConnected);

        System.out.println("\nNumber of provinces: "+count);

    }
}
