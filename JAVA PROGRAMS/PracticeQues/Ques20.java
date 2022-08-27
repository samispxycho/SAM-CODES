import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();

        for(int i=1;i<11;i++)
        {
            System.out.println(num+"*"+i+" is equals to "+num*i);
        }
    }
}
