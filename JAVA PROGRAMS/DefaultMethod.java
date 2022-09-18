
interface MyCamera
{
    void takingPics();
    void recordingVids();
    default void recording4kVids()          //defining a method using default keyword
    {
        System.out.println("Recording in 4k resolution");
    }
    
}

interface FiWi
{
    void listOfFiwi();
    void myConnecting();
}

class myCellPhone
{
    void myCalling()
    {
        System.out.println("Calling dialed number");
    }
    void myRecieving()
    {
        System.out.println("Tap to recieve this call");
    }
}

class mySmartPhone extends myCellPhone implements MyCamera,FiWi
{
    public void takingPics()
    {
        System.out.println("Snapping a picture");
    }

    public void recordingVids()
    {
        System.out.println("Recording video now");
    }

    public void listOfFiwi()
    {
        System.out.println("Apple hotspot");
        System.out.println("Samsung hotspot");
        System.out.println("Realme hotspot");
    }

    public void myConnecting()
    {
        System.out.println("Connecting to apple hotspot");
    }

    /* 
    To see the overrided result, uncomment

        public void recording4kVids()
        {
            System.out.println("Snapping and recording in 4k resolution");
        }

    */
}
public class DefaultMethod {
    public static void main(String[] args) {
        mySmartPhone obj=new mySmartPhone();
        obj.takingPics();
        obj.recordingVids();
        
        obj.listOfFiwi();
        obj.myConnecting();

        obj.myCalling();
        obj.myRecieving();

        obj.recording4kVids();      //Calling default method created inside an interface
    }
}
