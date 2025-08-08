package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        int n = graph.length;
        int indegree[] = new int[n];

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int u = 0; u < n; u++) {
            for (int v : graph[u]) {
                adjList.get(v).add(u);
                indegree[u]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> topo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);

            for (int ele : adjList.get(node)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    queue.add(ele);
                }
            }
        }

        Collections.sort(topo);

        return topo;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},
            {2, 3},
            {5},
            {0},
            {5},
            {},
            {}
        };

        EventualSafeStates sol = new EventualSafeStates();
        List<Integer> result = sol.eventualSafeNodes(graph);

        System.out.println(result);
    }
}
