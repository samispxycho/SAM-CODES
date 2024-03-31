package ARRAY;

public class AverageOfEle {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int len = arr.length;
        int sum = 0;

        for(int ele:arr) sum+= ele;

        System.out.println("Average is "+sum/len);

    }
}
