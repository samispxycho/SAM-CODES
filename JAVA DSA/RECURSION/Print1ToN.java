package RECURSION;

public class Print1ToN {

    static void printn(int i,int n){
        if(i>n)return;
        else{
            System.out.println(i++);
            printn(i, n);
        }
    }

    public static void main(String[] args) {
        Print1ToN.printn(1, 10);
    }
}
