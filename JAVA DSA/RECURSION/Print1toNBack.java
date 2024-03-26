package RECURSION;
//Printing 1 to n using backtracking

public class Print1toNBack {

    static void disp(int i,int n){
        if(i==0)return;
        else{
            disp(i-1,n);
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Print1toNBack.disp(5, 5);
    }
}
