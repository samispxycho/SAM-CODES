package GRAPHS;

import java.util.*;

public class TopoSortBfs {

    public static ArrayList<Integer> topoSort(int V, int edges[][]) {

        // Converting adjMatrix to adjList
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }

        // Actual logic
        int indegree[] = new int[V];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            for (int ele : adjList.get(i)) {
                indegree[ele]++;
            }
        }

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            al.add(node);

            for (int ele : adjList.get(node)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    queue.add(ele);
                }
            }
        }

        return al;

    }

    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {
                { 5, 2 },
                { 5, 0 },
                { 4, 0 },
                { 4, 1 },
                { 2, 3 },
                { 3, 1 }
        };

        topoSort(V, edges);
    }
}
