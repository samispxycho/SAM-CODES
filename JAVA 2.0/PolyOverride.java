
/*
class A{
    void show(){
        System.out.println("Show of class A");
    }
}

class B extends A{

    @Override
    void show(){
        System.out.println("Show of class B");
    }
}

public class PolyOverride {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}
*/

/*
//Covarient return type
class A{
    Object show(){      //Object super class
        System.out.println("Show of class A");
        return null;
    }
}

class B extends A{

    @Override
    String show(){      //String sub class of object
        System.out.println("Show of class B");
        return " ";
    }
}

public class PolyOverride {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}
*/

/*
//METHOD OVERRIDING AND EXCEPTION HANDELLING(TWO CASES)

//if parent class does not throw exception, child can throw only unchecked exception
class A{
    void show(){
        System.out.println("1");
    }
}
class B extends A{
    void show()throws ArithmeticException{
        System.out.println("2");
    }
}
public class PolyOverride{
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}

//if parent class throws exception, child can throw either same or subclass exception
class A{
    void show() throws RuntimeException{
        System.out.println("1");
    }
}
class B extends A{
    void show() throws ArithmeticException{
        System.out.println("2");
    }
}
public class PolyOverride{
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
*/

/*
abstract class A{
   abstract void show();
}
class B extends A{
    void show(){
        System.out.println("1");
    }
}
public class PolyOverride{
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
---same with interfaces
*/

//To invoke parent class method using child class object
class A{
    void show(){
        System.out.println("1");
    }
}
class B extends A{
    void show(){
        super.show();           //using super keyword
        System.out.println("2");
    }
}
public class PolyOverride{
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}