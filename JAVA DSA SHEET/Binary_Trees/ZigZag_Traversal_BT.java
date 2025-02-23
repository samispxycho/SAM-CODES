package Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }
}

public class ZigZag_Traversal_BT {

    static List<List<Integer>> zigZagTraversal(Node root){

        int flag=1;
        List<List<Integer>> al = new ArrayList<>();
        if(root==null)return al;

        Queue<Node>queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            ArrayList<Integer>inner=new ArrayList<>();
            int size = queue.size();

            while(size-- > 0){

                Node ele = queue.poll();
                inner.add(ele.data);

                if(ele.left!=null)queue.add(ele.left);
                if(ele.right!=null)queue.add(ele.right);

            }

            if(flag==1){
                al.add(inner);
                flag=0;
            }else{
                Collections.reverse(inner);
                al.add(inner);
                flag = 1;
            }

        }
        return al;
    }

    public static void main(String[] args) {
        
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> al = new ArrayList<>();
        al = ZigZag_Traversal_BT.zigZagTraversal(root);

        for(List<Integer> ele:al){
            for(int ele2:ele){
                System.out.print(ele2+" ");
            }
        }

    }
}
