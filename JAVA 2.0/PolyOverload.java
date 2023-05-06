/*
Method overloading with different arguments

class A{
    void show(){
        System.out.println("First");
    }
    void show(int a){
        System.out.println("Second");
    }
}

public class PolyOverload {
    public static void main(String[] args) {
        A obj=new A();
        obj.show(10);
    }
}
*/

/*
Method overloading with sequence of characters changed

class A{
    void show(int a,String b){
        System.out.println("First");
    }
    void show(String b,int a){
        System.out.println("Second");
    }
}

public class PolyOverload {
    public static void main(String[] args) {
        A obj=new A();
        obj.show("abc",10);
    }
}
*/


/*
//Method overloading using different types of arguments
class A{
    void show(int a){
        System.out.println("First");
    }
    void show(String a){
        System.out.println("Second");
    }
}

public class PolyOverload {
    public static void main(String[] args) {
        A obj=new A();
        obj.show("Abc");
        obj.show(10);
    }
}
*/

/*
//Automatic promotion(refer notes)
class A{
    void show(int a){
        System.out.println("Integer");
    }
    void show(String a){
        System.out.println("String");
    }
}
public class PolyOverload {
    public static void main(String[] args) {
        A obj=new A();
        obj.show('a');
    }
}
*/

//if methods are of same level
class A{
    void show(StringBuffer a){
        System.out.println("String buffer");
    }
    void show(String a){
        System.out.println("String");
    }
}
public class PolyOverload {
    public static void main(String[] args) {
        A obj=new A();
        obj.show("abc");
        obj.show(new StringBuffer("xyz"));
    }
}

