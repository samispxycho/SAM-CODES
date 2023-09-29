public class Recusion {

    static void nToOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        nToOne(--n);
    }

    static void sumOfN(int start,int end,int sum){
        if(start>end){
            System.out.println(sum);
            return;
        }
        sum+=start;
        sumOfN(start+1, end,sum);
    }

    static int fact(int n){
        if(n == 1 || n==0)return 1;
        else return n* fact(n-1);
    }

    static void table(int num,int multiplier){
        if(multiplier > 10){
            return;
        }
        System.out.println(num+"*"+multiplier+"="+num * multiplier );
        table(num,multiplier+1);
    }

    static int power(int num,int p){
        if(p==0){
            return 1;
        }
        return num * power(num,p-1);
    }

    static int fibo(int num){
        if(num == 0){
            return 1;
        }
        if(num == 1){
            return 1;
        }
        else return fibo(num-1)+fibo(num-1);
    }

    static void fibo(int num1,int num2,int noOfTerm){

        if(noOfTerm == 0){
            return;
        }

        int num3 = num1 + num2;
        System.out.println(num3);
        fibo(num2,num3,noOfTerm-1);
    }

    static void rev(int[]arr,int i,int j){
        if(i >= j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        rev(arr,i+1,j-1);
    }

    static boolean pallinString(String str,int i,int j){
        if(i >= j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        return pallinString(str, i+1, j-1);
    }

    public static void main(String[] args) {

        //Print number from n to 1 using recursion
        //nToOne(5);

        //Print sum of n natural numbers
        //sumOfN(1, 5,0);

        //Factorial program
        // System.out.println(fact(5));

        //Table program
        //table(3,1);

        //Power program
        //System.out.println(power(2,8));

        //Fibonacci series
        // int num1 = 0;
        // int num2 = 1;
        // int noOfTerm = 10;
        // System.out.println(num1);
        // System.out.println(num2);
        // fibo(num1,num2,noOfTerm-2);

        //Reverse an array using recursion
        // int [] arr = {1,2,3,4,5};
        // int i = 0;
        // int j = arr.length -1;
        // rev(arr,i,j);
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }

        //if string is pallindrome
        String str = "racecar";
        int i = 0;
        int j = str.length()-1;
        boolean result = pallinString(str, i, j);
        if(result == true)System.out.println("Pallindrome");
        else System.out.println("Not pallindrome");
        
        
    }
}
