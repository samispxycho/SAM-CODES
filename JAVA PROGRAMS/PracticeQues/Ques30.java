import java.util.Scanner;

class Rectangle
{
    private int length;
    private int breadth;

    public Rectangle()
    {
        length=4;
        breadth=5;
    }

    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }

    public void area()
    {
        System.out.println("The area of the rectangle is: "+length*breadth);
    }
}

public class Ques30 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.area();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len=sc.nextInt();
        System.out.print("Enter the breadth: ");
        int bre=sc.nextInt();
        sc.close();

        Rectangle obj1=new Rectangle(len,bre);
        obj1.area();

    }
}
