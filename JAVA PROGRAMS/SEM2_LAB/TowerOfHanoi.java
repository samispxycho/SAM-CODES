package SEM2_LAB;

public class TowerOfHanoi {

    static void TOH(int n,char from, char to, char help){
        if(n==0){
            return;
        }

        TOH(n-1,from,help,to);
        System.out.println("Move "+n+" from "+from+" to "+to);
        TOH(n-1,help,to,from);

    }

    public static void main(String[] args) {
        TOH(2, 'A', 'B', 'C');
    }
}
