package RECURSION;

public class SumOfNR {

    static int sum1(int n){         //Functional way

        if(n<1)return 0;

        return n + sum1(n-1);
    }

    static void sum2(int i,int sum){    //Parameterized way
        if(i==0){
            System.out.println(sum);
            return;
        }

        sum2(i-1,sum+i);
    }

    public static void main(String[] args) {
        System.out.println(sum1(5));
        sum2(5,0);
    }
}
