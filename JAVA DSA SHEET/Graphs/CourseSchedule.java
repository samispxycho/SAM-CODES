package Graphs;
import java.util.*;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
        }

        int indegree[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int nodes : adjList.get(i)) {
                indegree[nodes]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
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

        if (count == numCourses) return true;
        return false;
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {
            {1, 0},
            {2, 1},
            {3, 2}
        };

        boolean result = canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + result);
    }
}
