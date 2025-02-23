package Binary_Trees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }
    
}

public class Diameter_Of_BT {

    int maxi = 0;

    int height(Node root){

        if(root==null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        maxi = Math.max(maxi,left+right);

        return 1+Math.max(left,right);

    }

    int diameterOfBT(Node root){
        height(root);
        return maxi;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        Diameter_Of_BT obj = new Diameter_Of_BT();
        int maximum = obj.diameterOfBT(root);
        System.out.println(maximum);

    }
}
