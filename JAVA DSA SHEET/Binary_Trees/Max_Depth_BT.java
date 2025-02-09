package Binary_Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Max_Depth_BT {

    static int maxDepth(Node root){

        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right =maxDepth(root.right);

        int max = Math.max(left,right);

        return max+1;

    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(4);

        int height = Max_Depth_BT.maxDepth(root);
        System.out.println(height);

    }
}
