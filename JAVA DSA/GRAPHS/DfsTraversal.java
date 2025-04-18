package GRAPHS;

import java.util.ArrayList;

public class DfsTraversal {

    static void dfsT(int node,ArrayList<ArrayList<Integer>>adj,boolean visited[],ArrayList<Integer>al){

        visited[node]=true;
        al.add(node);

        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                dfsT(neighbour, adj, visited, al);
            }
        }

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
        boolean visited[]=new boolean[adj.size()];

        dfsT(0,adj,visited,al);

        System.out.println();
        for(int ele:al)System.out.print(ele+" ");

    }
}
