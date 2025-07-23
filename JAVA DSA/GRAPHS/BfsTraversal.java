package GRAPHS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BfsTraversalClass{

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> list){

        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer>queue = new LinkedList<>();
        boolean visited[] = new boolean[list.size()];

        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){

            int node = queue.poll();
            al.add(node);

            for(int neighbour :  list.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        return al;

    }

}

public class BfsTraversal {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int nodes = 5;

        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(0).add(3);
        graph.get(3).add(0);

        graph.get(0).add(1);
        graph.get(1).add(0);

        ArrayList<Integer>al=new ArrayList<>();
        al = BfsTraversalClass.bfs(graph);

        for(int ele:al){
            System.out.println(ele+" ");
        }

    }
}
