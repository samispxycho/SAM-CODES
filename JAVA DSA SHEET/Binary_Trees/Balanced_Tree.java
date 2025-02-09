package Binary_Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Balanced_Tree {

    static int depth(Node root){
        if(root == null)return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        if(left==-1 || right==-1 || Math.abs(left-right)>1)return -1;

        return Math.max(left,right)+1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.left.left = new Node(5);
    
        boolean check = Balanced_Tree.depth(root)!=-1;
        System.out.println(check);

    }
}
