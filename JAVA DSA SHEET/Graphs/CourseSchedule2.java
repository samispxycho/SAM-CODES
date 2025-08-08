package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int edge[] : prerequisites) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(v).add(u);
        }

        int indegree[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int ele : adjList.get(i)) {
                indegree[ele]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int topo[] = new int[numCourses];
        int index = 0;

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo[index] = node;
            index += 1;

            for (int ele : adjList.get(node)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    queue.add(ele);
                }
            }
        }

        if (numCourses == index) {
            return topo;
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = { {1, 0}, {2, 0}, {3, 1}, {3, 2} };
        int[] order = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(order));
    }
}
