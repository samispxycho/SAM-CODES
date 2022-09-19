
abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone70 extends TelePhone
{
    void ring()
    {
        System.out.println("This phone can ring");
    }
    void lift()
    {
        System.out.println("Its difficult to lift this phone");
    }
    void disconnect()
    {
        System.out.println("The line is disconnected");
    }

    void gps()
    {
        System.out.println("I have inbuilt gps too");
    }

    void cam()
    {
        System.out.println("Also I have 64mps quad camera setup");
    }
}

public class Ques34 {
    public static void main(String[] args) {
        TelePhone obj=new SmartPhone70();
        System.out.println("Old telephones are: ");
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
