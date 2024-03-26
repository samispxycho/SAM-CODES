public class Trash {

    static void func(){
        System.out.println(1);
        func();
    }

    public static void main(String[] args) {
        Trash.func();
           
    }
}
