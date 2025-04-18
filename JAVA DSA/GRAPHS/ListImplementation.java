package GRAPHS;

import java.util.ArrayList;

class GraphUsingList{

    ArrayList<ArrayList<Integer>> graphList;

    GraphUsingList(int size){
        graphList=new ArrayList<>();
        for(int i=0;i<size;i++){
            graphList.add(new ArrayList<>());
        }
    }

    void addEdge(int u,int v){
        graphList.get(u).add(v);
        graphList.get(v).add(u); //for undirected graph
    }

    void display(){
        for(int i=0;i<graphList.size();i++){
            System.out.println("\n"+i+" node is connected to: "+graphList.get(i));
        }
    }

}

public class ListImplementation {
    public static void main(String[] args) {
        GraphUsingList graph=new GraphUsingList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.display();

    }
}
