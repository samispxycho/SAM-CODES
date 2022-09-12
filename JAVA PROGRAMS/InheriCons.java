
class Base
{
    public Base()
    {
        System.out.println("Mai base class ka constructor hun.");
    }
}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Mai derived class ka constructor hun.");
    }
}


public class InheriCons {
    public static void main(String[] args) {
        Derived b=new Derived();
    }
}
