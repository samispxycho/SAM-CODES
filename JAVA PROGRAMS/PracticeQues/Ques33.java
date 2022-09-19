
class Monkey
{
    void jump()
    {
        System.out.println("I love jumping");
    }

    void bite()
    {
        System.out.println("Be careful of the bite");
    }
}

interface BasicMonkey
{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicMonkey
{
    public void eat()
    {
        System.out.println("I love eating");
    }

    public void sleep()
    {
        System.out.println("Everybody loves sleeping");
    }
}


public class Ques33 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.jump();
        obj.bite();
        obj.eat();
        obj.sleep();
    }
}
