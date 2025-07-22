package GRAPHS;
import java.util.ArrayList;

class GraphUsingList{

    ArrayList<ArrayList<Integer>> graph;

    GraphUsingList(int size){
        graph = new ArrayList<>();

        for(int i=0;i<size;i++){
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void display(){
        for(int i=0;i<graph.size();i++){
            System.out.println(i+" node is connected to: "+graph.get(i));
        }
    }

}

public class ListImplementation {
    public static void main(String[] args) {
    
        GraphUsingList graph = new GraphUsingList(4);

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);

        graph.display();

    }
}
