package Binary_Trees;

//Given an integer i. Print the maximum number of nodes on level i of a binary tree.

public class Introduction_to_Trees {

    static int maxNodesAtI(int i){
        return (int)Math.pow(2,i-1);
    }

    public static void main(String[] args) {
        int ans=maxNodesAtI(3);
        System.out.println(ans);
    }
}
