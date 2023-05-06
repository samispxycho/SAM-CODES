
//Single level inheritence
class Animal{
    void eat(){
        System.out.println("Eat method of animal class");
    }
}

public class Inheritence extends Animal {
    public static void main(String[] args) {
        Inheritence obj=new Inheritence();
        obj.eat();
    }
}

/* 
//Multi level inheritence

class A{
    public void ShowA(){
        System.out.println("A class method");
    }
}

class B extends A{
    public void ShowB(){
        System.out.println("B class method");
    }
}

class C extends B{
    public void ShowC(){
        System.out.println("C class method");
    }

    public static void main(String[] args){
        C obj=new C();
        obj.ShowC();
        obj.ShowB();
        obj.ShowA();
    }
}
*/

/*

Hierarchical inheritence

class A{
    public void ShowA(){
        System.out.println("A class method");
    }
}
class B extends A{
    public void ShowB(){
        System.out.println("B class method");
    }
}
class C extends A{
    public void ShowC(){
        System.out.println("C class method");
    }

    public static void main(String[] args){
        B obj=new B();
        obj.ShowA();

        C obj1=new C();
        obj1.ShowA();
    }
}
*/