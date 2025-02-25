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

public class Kth_Smallest_BST {

    ArrayList<Integer>al=new ArrayList<>();

    ArrayList<Integer>traverse(Node root){
        if(root==null)return al;

        traverse(root.left);
        al.add(root.data);
        traverse(root.right);

        return al;
    }

    public static void main(String[] args) {

        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(6);

        root.left.left=new Node(2);
        root.left.right=new Node(4);

        root.left.left.left=new Node(1);

        ArrayList<Integer>ans=new ArrayList<>();
        Kth_Smallest_BST obj=new Kth_Smallest_BST();
        
        ans=obj.traverse(root);
        System.out.println(ans.get(3-1)); //3=k

    }
}
