package SEM2_LAB;

public class AckermannFunc {

    static int AckFunc(int m,int n){
        if(m==0)return n+1;
        if(m>0 && n==0)return AckFunc(m-1, 1);

        return AckFunc(m-1, AckFunc(m, n-1));
    }

    public static void main(String[] args) {
        int check = AckFunc(1, 1);
        System.out.println(check);
    }
}
