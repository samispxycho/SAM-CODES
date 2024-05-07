package EXCEPTION_HAND;

/*
//Creating a checked exception
class AgeCheck extends Exception{       //For check exception extends Exception
    AgeCheck(){
        System.out.println("Not a valid age");
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        int age = 17;

        try{
            if(age < 18){                   //Checked exceptions need to handled using try catch
                throw new AgeCheck();
            }else{
                System.out.println("Valid age");
            }
        }catch(AgeCheck e){
            e.printStackTrace();
        }  
    }
}
*/

//Creating an unchecked exception

class AgeCheck extends RuntimeException{        //for unchecked exceptions-> extends RuntimeException
    AgeCheck(String msg){
        super(msg);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {   
        int age = 17;
        if(age < 18){                                       //Dont need try catch but will get abnormally terminated
            throw new AgeCheck("Not a valid age");
        }else{
            System.out.println("Valid age");
        }
    }
}


