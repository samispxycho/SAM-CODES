package Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data = key;
    }

}



public class Top_View_BT {

    static class Pair{
        
        Node node;
        int hd;

        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }

    }

    static ArrayList<Integer> TopViewBT(Node root){

        ArrayList<Integer>al = new ArrayList<>();
        Map<Integer,Integer>map = new TreeMap<>();

        if(root == null)return al;

        Queue<Pair>queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){

            Pair temp = queue.poll();
            Node node = temp.node;
            int hd = temp.hd;

            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }

            if(node.left!=null){
                queue.add(new Pair(node.left, hd-1));
            }

            if(node.right!=null){
                queue.add(new Pair(node.right, hd+1));
            }

        }

        for(Integer ele:map.values()){
            al.add(ele);
        }
        return al;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer>al = new ArrayList<>();
        al = Top_View_BT.TopViewBT(root);

        for(int ele:al){
            System.out.print(ele+" ");
        }

    }
}
