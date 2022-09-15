class SuperC
{
    public void Method1()
    {
        System.out.println("Method one of class SuperC");
    }

    public void same()
    {
        System.out.println("2nd method of class SuperC");
    }
}

class SubC extends SuperC
{
    public void Method2()
    {
        System.out.println("Method one of class SubC");
    }

    @Override
    public void same()
    {
        System.out.println("2nd method of class SubC");
    }
}

public class DynamicMD {
    public static void main(String[] args) {
       SuperC obj=new SubC();
       obj.Method1();
       obj.same();

       //obj.method2();       //invalid
    }
}
