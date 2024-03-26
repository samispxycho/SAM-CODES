package RECURSION;

public class SumOfN {

    /*
    //Parameterized way
    static void sumofn(int i,int sum){
        if(i<0){
            System.out.println(sum);
            return;
        }
        else{
            sumofn(i-1,sum+i);
        }
    }
    */


    //Functional way
    static int sumofn(int n){
        if(n==0){
            return 0;
        }else{
            return n+sumofn(n-1);
        }
    }

    public static void main(String[] args) {
        int result = SumOfN.sumofn(5);
        System.out.println(result);
    }
}
