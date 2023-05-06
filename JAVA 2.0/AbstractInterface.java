/*
//Abstract methods
abstract class Vehicle{
    abstract void start();
    abstract void no_of_tyres();

    void price(){
        System.out.println("2000");         //Normal methods dont have to be overrided
    }

}

class Jeep extends Vehicle{
    void start(){
        System.out.println("Starts with key");
    }
    void no_of_tyres(){
        System.out.println("Four");
        super.price();              //Acessing normal method of super class
    }
}

class Scooter extends Vehicle{
    void start(){
        System.out.println("Starts with kick");
    }

    void no_of_tyres(){
        System.out.println("Two");
    }

    void colour(){              //Normal method can also be created
        System.out.println("Green");
    }

}

public class AbstractInterface {
    public static void main(String[] args) {

        //Vehicle obj=new Vehicle();  //obj of abstract cant be created

        Jeep obj1=new Jeep();
        obj1.start();
        obj1.no_of_tyres();

        Scooter obj2=new Scooter();
        obj2.start();
        obj2.no_of_tyres();
        obj2.colour();
    }
}
*/

/*
//Interfaces
interface I1{
    void show();
}
class AbstractInterface implements I1{
    public void show(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        AbstractInterface obj=new AbstractInterface();
        obj.show();
    }
}
*/

//Achieving multiple inheritence using interfaces
interface I1{
    void show();
}
interface I2{
    void display();
}
class AbstractInterface implements I1,I2{       //single class having multiple parents
    public void show(){
        System.out.println("Show method");
    }
    public void display(){
        System.out.println("Display method");
    }

    public static void main(String[] args) {
        AbstractInterface ai=new AbstractInterface();
        ai.show();
        ai.display();
    }

}