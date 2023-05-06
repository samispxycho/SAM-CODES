public class ClassObjMethod {

    public void run(){
        System.out.println("This animal runs.");
    }

    public static void main(String[] args) {
        System.out.println("Testing");
        ClassObjMethod obj=new ClassObjMethod();
        obj.run();
        System.out.println("Testing 2");
        obj.eat();
    }
  
    public void eat(){
        System.out.println("This animal eats.");
    }
}

/*
Initializing variables using a reference variable

public class Animal{
    String name;
    int age;
    public static void main(String[] args){
        Animal obj=new Animal();
        obj.name="Dog";
        obj.age=12;
    }
} 
 */


 /*
 Initializing variables using methods

public class Animal{
    String name;
    String age;

    public void assign(String n,int a){
        name=n;
        age=a;
    }

    public static void main(String[] args){
        Animal obj=new Animal();
        obj.assign("Dog",12);
    }
}
*/
