import java.util.Scanner;

class school
{
    String name;
    int position;
    public school(String n,int posi)
    {
        name=n;
        position=posi;
    }

    public void output()
    {
        System.out.println("School name is "+name);
        System.out.println("School position is "+position);
    }
}


public class Constructors {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the name of the school: ");
        String naam=sc.next();

        System.out.print("Enter your position: ");
        int p=sc.nextInt();
        
        sc.close();

        school obj=new school(naam,p);
        obj.output();
    }
}
