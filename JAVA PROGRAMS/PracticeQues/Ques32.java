
abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen 
{
    public void write()
    {
        System.out.println("Fountain pen can be used for smooth writing");
    }
    public void refill()
    {
        System.out.println("Once finished, it can be refilled again");
    }

    public void ChangeNib()
    {
        System.out.println("Nib is also replacable");
    }
}

public class Ques32 {
    public static void main(String[] args) {
        FountainPen obj=new FountainPen();
        obj.write();
        obj.refill();
        obj.ChangeNib();
    }
}
