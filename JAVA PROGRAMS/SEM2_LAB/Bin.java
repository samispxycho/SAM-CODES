import java.util.Scanner;

class ThisIsWrong extends Exception{
    ThisIsWrong(String msg){
        super(msg);
    }
}

public class Bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            String name;
            name=sc.nextLine();
            String upper=name.toUpperCase();
            if(!name.equals(upper)){
                throw new ThisIsWrong("Enter name in upper case only");
            }

        }

    }
}
