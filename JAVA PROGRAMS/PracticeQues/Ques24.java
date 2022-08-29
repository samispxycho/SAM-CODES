import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int num=sc.nextInt();
        sc.close();

        int [] arr={100,150,200,250,300,350,400,450,500};
        byte count=0;

        for(int element: arr)
        {
            if(element==num)
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println("Element found!");
        }
        else
        {
            System.out.println("Element not found!");
        }
    }
}
