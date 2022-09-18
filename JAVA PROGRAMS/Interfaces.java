interface Cycle
{
    int a=145;          //Property
    void AppBreak(int decrement);
    void AppSpeed(int increment);
    void disp();
}

class Bmx implements Cycle
{
    int speed=100;
    public void AppBreak(int decrement)     //imp to add "public"
    {
        speed=speed-decrement;
    }
    public void AppSpeed(int increment)
    {
        speed=speed+increment;
    }
    public void disp()
    {
        System.out.println("The speed of the car is "+speed);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Bmx obj=new Bmx();
        obj.AppBreak(30);
        obj.disp();

        obj.AppSpeed(70);
        obj.disp();

        /*
            We can create and use properties in interfaces
            System.out.println(obj.a()); ---> This is valid

            But we cannot modify the properties
            obj.a=170;  ----> This is not valid

            We can implement two or more cases by using ",".
             For example:
                class Bmx implements Bicyle,Horn,Steer
                {
                    //code//
                }
        */
    }
}
