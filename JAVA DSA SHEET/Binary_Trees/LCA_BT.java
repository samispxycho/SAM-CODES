package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class LCA_BT {

    static Node findLCA(Node node,Node p,Node q){

        if(node==null || node == p || node == q){
            return node;
        }

        Node left = findLCA(node.left, p, q);
        Node right = findLCA(node.right, p, q);

        if(left!=null && right!=null){
            return node;
        }

        if(left!=null)return left;

        return right;

    }

    public static void main(String[] args) {
        
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        Node p = root.left.left;
        Node q = root.left.right.right;

        Node ans = LCA_BT.findLCA(root,p,q);
        System.out.println(ans.data);

    }
}
