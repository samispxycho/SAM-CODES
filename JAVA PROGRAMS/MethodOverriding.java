
class A
{
    public void method1()
    {
        System.out.println("Im method 1 of class A");
    }
}

class B extends A
{
    @Override
    public void method1()
    {
        System.out.println("I am method 1 of class B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        A obj1=new A();
        obj1.method1();

        B obj2=new B();
        obj2.method1();
    }
}
