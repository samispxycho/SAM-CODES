import java.util.Scanner;

public class Ques27 {

    static int add(int x)
    {
        int sum=0;
        sum+=add(x);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number upto which you want to find the sum of: ");
        int num=sc.nextInt();
        sc.close();

        int tot=add(num);
        System.out.println(tot);
        
    }
}
