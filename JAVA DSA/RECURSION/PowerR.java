package RECURSION;

public class PowerR {

    static int powerr(int num,int n){
        if(n==0) return 1;
        return num * powerr(num,n-1);
    }

    public static void main(String[] args) {
        System.out.println(powerr(5,3));
    }
}
