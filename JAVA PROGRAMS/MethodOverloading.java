public class MethodOverloading {

    static void marvel()
    {
        System.out.println("I love you");
    }

    static void marvel(int a)       //here int a is a parameter
    {
        System.out.println("I love you "+a);
    }

    static void marvel(int a,int b)         //here int a and int b is a parameter
    {
        System.out.println("I love you "+a);
        System.out.println("Mark "+b+" is the first iron man suit");
    }

    public static void main(String[] args) {
       marvel(); 
       marvel(3000);            //here 3000 is an argument
       marvel(3000,1);         //here 3000 and 1 are arguments
    }
}

//Arguments are Actual