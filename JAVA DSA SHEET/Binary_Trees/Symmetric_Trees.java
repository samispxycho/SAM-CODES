package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}
public class Symmetric_Trees {

    static boolean isIdentical(Node p,Node q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.data!=q.data)return false;
        return isIdentical(p.left,q.right) && isIdentical(p.right,q.left);
    }

    static boolean symmetricTrees(Node root){
        if(root == null)return true;
        return Symmetric_Trees.isIdentical(root.left,root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        
        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(Symmetric_Trees.symmetricTrees(root));

    }
}
