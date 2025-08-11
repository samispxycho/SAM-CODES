import java.util.Scanner;

public class ArrayInput{
    public static void main(String[] args) {
        int len,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array you want to create: ");
        len=sc.nextInt();   //Asking user the length

        int [] marks=new int[len]; //creating array of the same size
        
        System.out.println("Enter the elemets: ");
        for(i=0;i<len;i++)      //Asking user the elements of array
        {
            marks[i]=sc.nextInt();
        }
    
        //To display
        for(j=0;j<len;j++)
        {
            System.out.print(marks[j]);
            System.out.print(" ");
        }
    }
}
