public class Fibo {
    public static void main(String[] args) {
        int f = 0;
        int s = 1;
        System.out.println(f);
        System.out.println(s);

        for(int i=3;i<=10;i++){
            int r = f+s;
            System.out.println(r);
            f=s;
            s=r;
        }
    }
}
