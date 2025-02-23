package Binary_Trees;

import java.util.ArrayList;
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

public class Average_Of_Levels {

    static List<Double> averageOfLevel(Node root){

        List<Double>al=new ArrayList<>();
        if(root==null)return al;

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size=queue.size();
            double sum = 0;
            double temp = size;

            while(size-- > 0){
                Node ele = queue.poll();
                sum = sum+ele.data;

                if(ele.left!=null)queue.add(ele.left);
                if(ele.right!=null)queue.add(ele.right);

            }

            double res = sum/temp;
            al.add(res);

        }
        return al;
    }

    public static void main(String[] args) {
        
        Node root=new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<Double>al = new ArrayList<>();
        al = Average_Of_Levels.averageOfLevel(root);

        for(double ele:al){
            System.out.print(ele+" ");
        }

    }
}
