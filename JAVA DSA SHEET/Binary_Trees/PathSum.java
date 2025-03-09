package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class PathSum {

    static boolean pathSum(Node root,int target){
        if(root==null)return false;

        target-=root.data;

        if(root.left==null && root.right==null){
            return target==0;
        }

        return pathSum(root.left,target)||pathSum(root.right, target);
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(4);
        root.right=new Node(8);

        root.left.left=new Node(11);

        root.left.left.left=new Node(7);
        root.left.left.right=new Node(2);

        root.right.left=new Node(13);
        root.right.right=new Node(4);
        
        root.right.right.right=new Node(1);

        System.out.println(PathSum.pathSum(root,22));

    }
}
