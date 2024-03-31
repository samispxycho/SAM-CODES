package BINARY_TREE;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
    }
}

public class HeightOfTree {

    static int heightOfTree(Node node){
        if(node==null)return 0;

        int heightL=heightOfTree(node.left);
        int heightR=heightOfTree(node.right);

        return 1+Math.max(heightL, heightR);
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

        int h=HeightOfTree.heightOfTree(root);
        System.out.println("Height of tree is: "+h);

    }
}
