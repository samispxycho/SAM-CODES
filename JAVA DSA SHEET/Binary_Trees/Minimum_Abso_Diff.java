package Binary_Trees;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Minimum_Abso_Diff {

    static int ans=Integer.MAX_VALUE;
    static Integer last=null;

    static int minimumAbsoDiff(Node root){

        if(root==null)return ans;

        minimumAbsoDiff(root.left);

        if(last!=null){
            ans=Math.min(ans,Math.abs(root.data-last));
        }
        last=root.data;

        minimumAbsoDiff(root.right);
        return ans;
    }

    public static void main(String[] args) {
        
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(6);

        root.left.left=new Node(1);
        root.left.right=new Node(3);

        System.out.println(Minimum_Abso_Diff.minimumAbsoDiff(root));

    }
}
