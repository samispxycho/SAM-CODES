/*
//refer to current class instance variable
class A{
    int a;
    void set(int a){
        this.a=a;
    }
    void get(){
        System.out.println(a);
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        A obj=new A();
        obj.set(100);
        obj.get();
    }
}
*/

/*
//is used to call current class method
public class thiskeyword{

    void show(){
        System.out.println("Hello");
    }

    void display(){
        show();         //Compiler will automaticall convert this to "this.display();"
    }
    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.display();
    }
}
*/

/*
public class thiskeyword{
    thiskeyword(){
        this(10);
        System.out.println("No argument constructor");
    }
    thiskeyword(int a){
        //this();
        System.out.println("Parameterized constructor");
    }
    void display(){
        System.out.println("hey");
    }
    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.display();
    }
}
*/

/*
// SUPER KEYWORD
//to call parent class variable
class A{
    int a=10;
}
class thiskeyword extends A{
    int a=20;
    void show(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.show();
    }

}
*/

/*
//to call parent class method
class A{
    void show(){
        System.out.println("Parent class show");
    }
}
class thiskeyword extends A{
    void show(){
        System.out.println("Child class show");
        super.show();
    }

    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.show();
    }
}
*/

/*
//to invoke parent class constructor
class A{
    A(){
        System.out.println("Parent class constructor");
    }
}
class thiskeyword extends A{
    thiskeyword(){

        //super();      //compiler will automatically call this  
        System.out.println("Child class constructor");
    }

    void show(){
        System.out.println("Hey");
    }

    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.show();
    }
}
*/

//FINAL KEYWORD
/*
//used with variables
class thiskeyword{
    public static void main(String[] args) {
        final int a=10;
        a=a+10;
        System.out.println(a);
    }
}
*/

/*
//final with method
class A{
    final void show(){
        System.out.println("Parent class show");
    }
}
class thiskeyword extends A{
    void show(){
        System.out.println("Child class show");
    }

    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.show();
    }
}
*/

/*
//final with class

final class A{
    int a=10;
}
class thiskeyword extends A{
    void show(){
        System.out.println("heyy");
    }
    public static void main(String[] args) {
        thiskeyword tk=new thiskeyword();
        tk.show();
    }
}
*/

