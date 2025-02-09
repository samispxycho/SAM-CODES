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

public class Left_View_BT {

    static ArrayList<Integer> LeftViewBT(Node root){
        
        ArrayList<Integer>al = new ArrayList<>();

        if(root==null){
            return al;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();
            Integer leftmost = null;

            while(size-- > 0){
                Node ele = queue.poll();
                leftmost = ele.data;

                if(ele.right!=null)queue.add(ele.right);
                if(ele.left!=null)queue.add(ele.left);
                
            }
            al.add(leftmost);
        }

        return al;
        
    }

    public static void main(String[] args) {
        

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        ArrayList<Integer>al = new ArrayList<>();
        al = LeftViewBT(root);
        for(int ele:al){
            System.out.print(ele+" ");
        }

    }
}
