
class Base1
{
    public Base1()
    {
        System.out.println("Mai base class ka constructor hun.");
    }

    public Base1(int x)
    {
        System.out.println("Im a base class constructor with value of x as "+x);
    }
}

class Derived1 extends Base1
{
     
    public Derived1()
    {
        //super(78);
        System.out.println("Mai derived class ka constructor hun.");
    }

    public Derived1(int x, int y)
    {
        super(x);
        System.out.println("Im a derived class overloaded constructor");
    }

}

class ChildOfDerived extends Derived1
{
    public ChildOfDerived()
    {
        System.out.println("Im a child of derived class");
    }

    public ChildOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("Im a overloaded constructor of child of derived");
    }
}


public class InheriCons {
    public static void main(String[] args) {
        //Derived1 obj=new Derived1(13,14);
        ChildOfDerived obj1=new ChildOfDerived(35,40,45);
    }
}
