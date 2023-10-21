public class WrapperClasses {
    public static void main(String[] args) {

        //Boxing-converting primitive to reference
        int x = 100;
        Integer obj1 = Integer.valueOf(x);  //Boxing
        Integer obj2 = x;                   //AutoBoxing

        //Unboxing-converting reference type to primitive
        Integer k = 100;
        int x1 = k.intValue();      //Unboxing
        int x2 = k;                 //AutoUnboxing

        //Parse Methods
        String str = "121";
        int num = Integer.parseInt(str);
        System.out.println(num);
        //Similarly other parse methods

        

        System.out.println(obj1 + obj2 + x1 + x2);
    }
}
