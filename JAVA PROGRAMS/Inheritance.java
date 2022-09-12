class Base
{
    int x;
    public void input(int num)
    {
        x=num;
    }
    public void output()
    {
        System.out.println("The number entered is "+x);
    }
}

class Derived extends Base
{
    int y;
    public void getdetails(int n)
    {
        y=n;
    }

    public void printdetails()
    {
        System.out.println("The number entered is "+y);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Derived d=new Derived();        //Creating derived class object

        //Calling derived class methods using derived class object
        d.getdetails(70);
        d.printdetails();

        //Calling base class methods using derived class object
        d.input(89);
        d.output();
    }
}
