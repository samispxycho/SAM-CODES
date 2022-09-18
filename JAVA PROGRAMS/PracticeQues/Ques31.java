
class Circle1
{
    public int radius1;

    public Circle1(int r)
    {
        this.radius1=r;
    }

    public double area1()
    {
        return Math.PI*radius1*radius1;
    }
}

class Cylinder1 extends Circle1         //inheriting the class Circle1
{
    public int height;

    public Cylinder1(int r,int h)
    {
        super(r);                       //Sending the radius entered to the superclass
        this.height=h;
    }

    public double volumn1()
    {
        return Math.PI*this.radius1*this.radius1*height;        //Math.PI is used for 3.14;
    }
}

public class Ques31 {
    public static void main(String[] args) {
        Cylinder1 obj=new Cylinder1(3, 5);      //Calling constructor of cylinder
        double result1=obj.volumn1();                //Calling volume method
        System.out.println("Volumn of cylinder is: "+result1);
        
        double result2=obj.area1();                     //Calling area method
        System.out.println("Area of circle is "+result2);
    }
}
