
class Z extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Sameer Upadhyay");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException v)
        {
            System.out.println("Unexpected error occured: "+v);
        }
    }
}

public class MTbyExtending {
    public static void main(String[] args) throws InterruptedException{
        Z obj=new Z();
        obj.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("samispxycho");
            Thread.sleep(1000);
        }
    }
}
