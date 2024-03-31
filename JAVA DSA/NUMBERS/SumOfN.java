package NUMBERS;

public class SumOfN {

    static void sumOfNumber(int num,int i,int sum){
        if(i > num){
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNumber(num, i+1, sum);
    }

    public static void main(String[] args) {
        int num = 5;
        sumOfNumber(num,1,0);
    }
}
