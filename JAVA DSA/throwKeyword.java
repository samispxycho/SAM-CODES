
class CheckAge extends RuntimeException{
    CheckAge(String msg){                       //Creating a custom class
        super(msg);
    }
}

public class throwKeyword {
    public static void main(String[] args) {
        int age = 9;
        if(age < 18){
            throw new CheckAge("You cant vote");        //manually creating a exception object
        }        
        else{
            System.out.println("You can vote");
        }
    }
}
