
interface MP64Cam
{
    void letsSnap();
    void letsRecord();
}

interface FiwiCalling
{
    void calling17();
    void recieving17();
}

class PhoneSmart implements MP64Cam,FiwiCalling
{
    public void letsSnap()
    {
        System.out.println("Lets take a snap");
    }

    public void letsRecord()
    {
        System.out.println("Im recording a video");
    }

    public void calling17()
    {
        System.out.println("You are calling through a wifi network");
    }
    public void recieving17()
    {
        System.out.println("Recieving call through a wifi network");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        FiwiCalling obj=new PhoneSmart();       //Dynamic method dispatch

        //obj.letsSnap(); ---> This is invalid, we can only use methods of fiwi
        //obj.letsRecord();  ---> Again Invalid
        
        obj.calling17();       //valid
        obj.recieving17();     //valid
    }
}
