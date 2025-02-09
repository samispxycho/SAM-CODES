package Binary_Trees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Node{
    
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}

public class Right_View_BT {

    static ArrayList<Integer> rightViewBT(Node root){

        ArrayList<Integer>al = new ArrayList<>();

        if(root==null){
            return al;
        }

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();
            Integer rightmost = null;

            while(size-- > 0){
                Node ele = queue.poll();
                rightmost = ele.data;

                if(ele.left!=null)queue.add(ele.left);
                if(ele.right!=null)queue.add(ele.right);

            }
            al.add(rightmost);
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
        al = rightViewBT(root);
        for(int ele:al){
            System.out.print(ele+" ");
        }

    }
}
