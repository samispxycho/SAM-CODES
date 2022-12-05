class X implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Sameer Upadhyay");
        }
    }
}

public class MTbyImplementing {
    public static void main(String[] args) {
        X obj=new X();
        Thread t=new Thread(obj);
        t.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("samispxycho");
        }
    }
}
