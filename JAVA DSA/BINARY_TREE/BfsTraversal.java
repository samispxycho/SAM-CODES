package BINARY_TREE;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
    }
}

public class BfsTraversal {

    static List<List<Integer>> levelorder(Node root){

        Queue<Node>queue=new LinkedList<>();
        List<List<Integer>>finalList=new LinkedList<>();

        if(root==null)return finalList;
        queue.offer(root);

        while(!queue.isEmpty()){
            int qsize=queue.size();
            List<Integer>sublist=new LinkedList<>();

            for(int i=0;i<qsize;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                sublist.add(queue.poll().data);
            }
            finalList.add(sublist);
        }
        return finalList;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(8);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);

        List<List<Integer>>elements=BfsTraversal.levelorder(root);
        for(List<Integer>ele2:elements){
            for(Integer ele3:ele2){
                System.out.print(ele3+" ");
            }
        }
    }
}
