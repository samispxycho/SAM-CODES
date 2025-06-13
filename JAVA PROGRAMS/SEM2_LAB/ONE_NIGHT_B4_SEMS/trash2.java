package SEM2_LAB.ONE_NIGHT_B4_SEMS;

class A{
    int x=10;
    A(){ 
        System.out.println("Parent class constructor");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Parent class variable called through super keyword: "+ super.x);
        System.out.println("Child class constructor");
    }
}

public class trash2 {
    public static void main(String[] args) {
        new B();
    }
}
