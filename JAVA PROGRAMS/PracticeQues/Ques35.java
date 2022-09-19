
interface TVRemote
{
    void companies();
    void type();
}

interface SmartTVRemote extends TVRemote
{
    void reach();
    void signal();
}

class television implements SmartTVRemote
{
    public void companies()
    {
        System.out.println("Samsung\nSony\nAsus");
    }

    public void type()
    {
        System.out.println("Wired\nWireless");
    }

    public void reach()
    {
        System.out.println("100ms\n150ms\n200ms");
    }

    public void signal()
    {
        System.out.println("Strong and expensive\nweak and cheap");
    }
}

public class Ques35 {
    public static void main(String[] args) {
        television obj=new television();
        obj.companies();
        obj.type();
        obj.reach();
        obj.signal();
    }
}
