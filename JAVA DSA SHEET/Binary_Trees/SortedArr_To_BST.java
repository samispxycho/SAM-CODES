package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class SortedArr_To_BST {

    Node tree(int[]arr,int lower,int upper){

        if(lower>upper){
            return null;
        }

        int node_index=(upper+lower)/2;
        int node_value=arr[node_index];
        Node root=new Node(node_value);

        root.left=tree(arr,lower,node_index-1);
        root.right=tree(arr,node_index+1,upper);

        return root;

    }

    public static void main(String[] args) {
        
        int arr[]={-10,-3,0,5,9};
        int lower=0;
        int upper=arr.length-1;

        SortedArr_To_BST obj=new SortedArr_To_BST();
        obj.tree(arr,lower,upper);

    }
}
