package Know_Basic_Maths;
import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int smaller_num = num1;
        if(num1>num2){
            smaller_num = num2;
        }

        int hcf=1;
        for(int i=2;i<=smaller_num;i++){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }

        System.out.println("Hcf of the numbers is: "+hcf);
        
        int lcm=(num1*num2)/hcf;
        System.out.println("Lcm of the numbers is: "+lcm);

        
        /*
        Manual way to calculate LCM
        
        int larger = num2;
        if(num1>num2) larger = num1;

        int lcm=larger;
        for(int i=larger+1;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
        */
    }
}
