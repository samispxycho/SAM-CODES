class A{
    void display(){
        System.out.println("A");
    }
}
class B extends A{
    void p(){
        System.out.println("B");
    }
}

class C extends B{
    void ou(){
        System.out.println("C");
    }
}


public class Trash {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();        
    }
}
