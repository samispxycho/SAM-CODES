package RECURSION;

public class Print1ToNR {

    static void p1toN(int i, int n) { // normal
        if (i > n)
            return;

        System.out.println(i);
        p1toN(i + 1, n);
    }


    static void p1toNBackTrack(int n){  //BackTracking
        if(n==0)
            return;
        
        p1toNBackTrack(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        p1toN(1, 10);
        p1toNBackTrack(10);
    }
}
