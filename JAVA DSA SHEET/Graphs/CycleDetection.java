package Graphs;
import java.util.*;

public class CycleDetection {

    public static boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }

        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int nodes : adjList.get(i)) {
                indegree[nodes]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;
            for (int ele : adjList.get(node)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    queue.add(ele);
                }
            }
        }

        if (count == V) return false;
        return true;
    }


    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 1}
        };

        boolean hasCycle = isCyclic(V, edges);
        System.out.println("Graph has cycle: " + hasCycle);
    }
}

