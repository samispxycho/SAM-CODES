package SEM2_LAB;

abstract class Animal{
    abstract void sound();
}

class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger Roarrrrr!!");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Bark Bark!!");
    }
}

public class AnimalQues {
    public static void main(String[] args) {
        Animal tiger=new Tiger();
        tiger.sound();
        Animal dog=new Dog();
        dog.sound();
    }
}
