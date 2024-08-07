package BINARY_TREE;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
    }
}

public class BalancedTree {

    static public boolean isBalanced(Node node){
        return treeHeight(node)!=-1;
    }
    public static int treeHeight(Node node){
        if(node==null)return 0;

        int lh=treeHeight(node.left);
        if(lh==-1)return -1;

        int rh=treeHeight(node.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1)return -1;

        return 1+Math.max(lh,rh);
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

        System.out.println(BalancedTree.isBalanced(root));
    }
}
