package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal {

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>>adj){

        ArrayList<Integer>al=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        Queue<Integer>queue=new LinkedList<>();

        visited[0]=true;
        queue.add(0);

        while(!queue.isEmpty()){
            int node=queue.peek();
            queue.remove();
            al.add(node);

            for(int neighbour:adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }

        }

        return al;
    }

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int vertices = 5;

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(0).add(3);
        adj.get(3).add(0);

        adj.get(0).add(1);
        adj.get(1).add(0);

        ArrayList<Integer>al=new ArrayList<>();
        al=bfs(adj);

        System.out.println();
        for(int ele:al)System.out.print(ele+" ");

    }
}
