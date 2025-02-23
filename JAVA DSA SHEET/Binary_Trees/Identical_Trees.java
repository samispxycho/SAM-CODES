package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Identical_Trees {

    static boolean identitcalTrees(Node p,Node q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.data!=q.data)return false;

        return identitcalTrees(p.left, q.left) && identitcalTrees(p.right, q.right);
    }

    public static void main(String[] args) {
        
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        System.out.println(Identical_Trees.identitcalTrees(p, q));

    }
}
