package GRAPHS;

class Graph{

    int matrix[][];
    int size;

    Graph(int size){
        this.size=size;
        matrix=new int[size][size];
    }

    void addEdge(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1; //this is for undirected graph only
    }

    void display(){
        for(int arr[] : matrix){
            for(int ele:arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

}

public class ArrayImplementation {
    public static void main(String[] args) {
        Graph graph=new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
    
        graph.display();
    }
}
