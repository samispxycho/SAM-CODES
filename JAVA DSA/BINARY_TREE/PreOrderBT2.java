package BINARY_TREE;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
    }
}

public class PreOrderBT2 {

    static void preOrder2(Node node){
        if(node==null){
            return;
        }
        Stack<Node>st=new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
            node=st.pop();
            System.out.print(node.data+" ");
            if(node.right!=null)st.push(node.right);
            if(node.left!=null)st.push(node.left);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(8);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);

        PreOrderBT2.preOrder2(root);
    }
}
