package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Invert_BT {

    Node invertBT(Node root){
        if(root==null)return root;

        Node temp=root.right;
        root.left=invertBT(root.right);
        root.right=invertBT(temp);

        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(7);

        root.left.left=new Node(1);
        root.left.right=new Node(3);

        root.right.left=new Node(6);
        root.right.right=new Node(9);

        Invert_BT obj = new Invert_BT();
        obj.invertBT(root);
    }
}
