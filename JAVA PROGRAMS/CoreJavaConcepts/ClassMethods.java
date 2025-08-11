class details
{
    int id;
    String name;

    public void printd()
    {
        System.out.print("Hi, my name is "+name);
        System.out.println(" and my unique ID is "+id);
    }
}

public class ClassMethods {
    public static void main(String[] args) {
        details obj=new details();
        obj.id=35;
        obj.name="SameerUpadhyay";
        obj.printd();

        details obj1=new details();
        obj1.id=1;
        obj1.name="AakashNautiyal";
        obj1.printd();
        
    }
}
