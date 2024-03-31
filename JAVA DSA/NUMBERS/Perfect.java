package NUMBERS;

public class Perfect {

    static int perfectNum(int num){
        int result = 0;
        for(int i = 1;i<num;i++){
            if(num % i == 0) result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 29;
        int result = perfectNum(num);
        if(result == num) System.out.println("Perfect number");
        else System.out.println("Not perfect");
    }
}
