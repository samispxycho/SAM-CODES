public class StaticMethod {

    static void add(int x,int y)     //Static way to define a function
    {
        int z=x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {        
        int a=10;int b=20;
        int x=40;int y=60;

        add(a,b);                   //Calling a function statically
        add(x,y);    
    }
}
