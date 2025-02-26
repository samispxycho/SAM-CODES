package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

//dry run on leetcode please
class Node{
    
    int data;
    Node left;
    Node right;
    Node next;

    Node(int key){
        data = key;
    }

}

public class Right_Pointers {

    static Node rightPointers(Node root){
        if(root==null)return root;

        Queue<Node>queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            Node previous=null;

            while(size-- > 0){
                Node ele = queue.poll();
                if(previous!=null){
                    previous.next=ele;
                }
                previous=ele;

                if(ele.left!=null)queue.add(ele.left);
                if(ele.right!=null)queue.add(ele.right);
            }
            previous.next=null;
        }

        return root;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        root = rightPointers(root);

    }
}
