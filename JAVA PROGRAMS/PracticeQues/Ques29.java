import java.util.Scanner;

class Cylinder
{
    private int radius;
    private int height;

    public Cylinder(int x,int y)
    {
        radius=x;
        height=y;
    }

    public void Area()
    {
        double a=3.14*radius*radius*height;
        System.out.println("Volume of the cylinder is: "+a);
    }
}

public class Ques29 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        int r=sc.nextInt();
        System.out.print("Enter the height of the cylinder: ");
        int h=sc.nextInt();
        sc.close();

        Cylinder obj=new Cylinder(r,h);
        obj.Area();
        
    }
}
