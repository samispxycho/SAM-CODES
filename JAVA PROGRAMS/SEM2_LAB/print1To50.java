package SEM2_LAB;

public class print1To50 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3==0 && i%5==0)System.out.print("TF ");
            else if(i%3==0)System.out.print("T ");
            else if(i%5==0)System.out.print("F ");
            else System.out.print(i+" ");
        }
    }
}
