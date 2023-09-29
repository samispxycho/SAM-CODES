package NUMBERS;

public class Armstrong {
    public static void main(String[] args) {
        
        int num1 = 153;
        int num2= num1;

        int digits = 0;
        while(num2 > 0){
            digits++;
            num2/=10;
        }

        num2=num1;

        int fi=0;
        while(num1 > 0){
            int d = num1%10;
            fi = fi + (int) Math.pow(d,digits);
            num1/=10;
        }

        if(num2 == fi)System.out.println("Armstrong number");
        else System.out.println("Not armstrong");

    }
}
