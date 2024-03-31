package NUMBERS;

public class Prime {
    public static void main(String[] args) {
        int num = 13;

        int count=1;
        for(int i=2;i<=num;i++){
            if(num%i == 0) count++;
        }
        if(count==2)System.out.println("Prime number");
        else System.out.println("Not prime");
    }
}
