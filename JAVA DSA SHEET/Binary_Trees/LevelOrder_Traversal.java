package Binary_Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class LevelOrder_Traversal {

    static ArrayList<ArrayList<Integer>> levelorderTraversal(Node root){

        ArrayList<ArrayList<Integer>> al =new ArrayList<>();

        if(root == null){
            return al;
        }

        Queue<Node>queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            ArrayList<Integer> inner = new ArrayList<>();
            int size = queue.size();

            while(size-- > 0){

                Node ele = queue.poll();
                inner.add(ele.data);

                if(ele.left!=null){
                    queue.add(ele.left);
                }

                if(ele.right!=null){
                    queue.add(ele.right);
                }

            }

            al.add(inner);

        }

        return al;

    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);

        root.right.right = new Node(4);

       root.right.right.left = new Node(6);
       root.right.right.right = new Node(5);

        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        al = LevelOrder_Traversal.levelorderTraversal(root);

        
        for(ArrayList<Integer>inner:al){
            for(int ele:inner){
                System.out.print(ele+" ");
            }
        }

    }
}
