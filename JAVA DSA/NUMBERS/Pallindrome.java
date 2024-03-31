package NUMBERS;

public class Pallindrome {
    public static void main(String[] args) {
        int num = 101;
        int num2=num;
        int rev=0;

        while(num2 > 0){
            int d = num2%10;
            rev=(rev * 10)+d;
            num2/=10;
        }
        if(rev == num) System.out.println("Pallindrome");
        else System.out.println("Not pallindrome");
    }
}
