package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class PathSum2 {
    int total=0;
    void pathSum2(Node root,int sum){
        if(root==null)return;
        sum=(sum*10)+root.data;

        if(root.left==null && root.right==null){
            total+=sum;
            return;
        }

        pathSum2(root.left,sum);
        pathSum2(root.right, sum);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        PathSum2 ob = new PathSum2();
        ob.pathSum2(root,0);
        System.out.println(ob.total);
    }
}
