package Binary_Trees;

import java.util.ArrayList;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Postorder_Traversal {

    static ArrayList<Integer>postorderTraversal(Node root){

        ArrayList<Integer>al=new ArrayList<>();

        if(root==null){
            return al;
        }

        al.addAll(postorderTraversal(root.left));
        al.addAll(postorderTraversal(root.right));
        al.add(root.data);

        return al;

    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);

        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        ArrayList<Integer>al=new ArrayList<>();
        al=Postorder_Traversal.postorderTraversal(root);

        for(int ele:al){
            System.out.print(ele+" ");
        }

    }
}
