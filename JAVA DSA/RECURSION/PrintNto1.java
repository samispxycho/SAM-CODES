package RECURSION;

public class PrintNto1 {
    static void printn(int n){
        if(n<1)return;
        else{
            System.out.println(n--);
            printn(n);
        }
    }
    public static void main(String[] args) {
        PrintNto1.printn(10);
    }
}
