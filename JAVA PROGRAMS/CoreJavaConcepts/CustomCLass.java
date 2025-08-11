
class first{                //custom class creation
    int id;
    String name;
}

public class CustomCLass {
    public static void main(String[] args) {
        System.out.println("This is our first custom class program");

        first obj=new first();              //creating object of the "first" class
        obj.id=35;
        obj.name="SameerUpadhyay";

        System.out.println(obj.id);         //using obj to print details of "first class"
        System.out.println(obj.name);
    }
}
