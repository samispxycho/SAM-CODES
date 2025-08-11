
abstract class People
{
    public People()
    {
        System.out.println("This is an abstract class");
    }

    abstract public void greet();
}

class student3 extends People
{
    public void greet()
    {
        System.out.println("Good morning");
    }
    
}

class teacher3 extends People 
{
    public void greet()
    {
        System.out.println("Namaste");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        student3 obj=new student3();
        teacher3 obj1=new teacher3();
        obj.greet();
        obj1.greet();
    }
}
