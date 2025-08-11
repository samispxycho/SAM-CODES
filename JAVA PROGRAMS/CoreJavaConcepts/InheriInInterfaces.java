
interface firstInterface
{
    void FuncOne();
    void FuncTwo();
}

interface secondInterface extends firstInterface
{
    void FuncThree();
    void FuncFour();
}

class sampleClass implements secondInterface
{

    public void FuncOne()
    {
        System.out.println("This is method number one");
    }

    public void FuncTwo()
    {
        System.out.println("This is method number two");
    }

    public void FuncThree()
    {
        System.out.println("This is method number three");
    }

    public void FuncFour()
    {
        System.out.println("This is method number four");
    }

    public void displ()
    {
        FuncOne();
        FuncTwo();
        FuncThree();
        FuncFour();
    }
}

public class InheriInInterfaces {
    public static void main(String[] args) {
        sampleClass obj=new sampleClass();
        obj.displ();
    }
}
