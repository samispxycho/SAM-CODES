package ARRAY;

public class SumOfEle {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int sum = 0;

        for(int ele:arr){
            sum+=ele;
        }
        System.out.println("Sum is "+sum);
    }
}
