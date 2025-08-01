package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortDFS {

    public static void dfs(int i, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adjList) {
        visited[i] = true;
        for (int node : adjList.get(i)) {
            if (!visited[node]) {
                dfs(node, visited, stack, adjList);
            }
        }
        stack.push(i);
    }

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack, adjList);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {
            {5, 2},
            {5, 0},
            {4, 0},
            {4, 1},
            {2, 3},
            {3, 1}
        };

        ArrayList<Integer> topoOrder = topoSort(V, edges);
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }
}
