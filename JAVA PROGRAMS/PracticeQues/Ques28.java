import java.util.Scanner;


class Square
{
    int side;
    public void getinfo(int s)
    {
        side=s;
    }

    public int area()
    {
        return side*side;
    }

    public int peri()
    {
        return 4*side;
    }
}

class Rectangle
{
    int length;
    int breath;

    public void getinfo(int l,int b)
    {
        length=l;
        breath=b;
    }

    public int area()
    {
        return length*breath;
    }

    public int peri()
    {
        return 2*(length+breath);
    }
}
public class Ques28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int si=sc.nextInt();
       
        Square obj=new Square();
        obj.getinfo(si);
        System.out.println("Area of the square is "+obj.area());
        System.out.println("Perimeter of the square is "+obj.peri());

        System.out.print("Enter the length of the rectangle: ");
        sc.nextInt();
        System.out.print("Enter the breath of the rectangle: ");
        sc.nextInt();
        sc.close();

        Rectangle obj2=new Rectangle();
        obj2.getinfo(4, 3);
        System.out.println("The area of the rectangle is "+obj2.area());
        System.out.println("The perimeter of the rectangle is "+obj2.peri());

    }   
}
