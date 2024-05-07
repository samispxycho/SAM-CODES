package EXCEPTION_HAND;

public class ThrowsKeyword {

    static void checkAge() throws ArithmeticException{  //warning calling method
        int num1 = 10;
        int num2 = 0;
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {        //caller method
        try{
            checkAge();
        }catch(Exception e){
            System.out.println("Cant divide by 0");
        }
    }   
}
