package ARRAY;
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondMinMax {
    public static void main(String[] args) {
        int [] arr={7,3,9,5,2,8,1,4,6};

        //for second SMALLEST or third SMALLEST, we have to use max-heap
        PriorityQueue<Integer>queue1=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            queue1.add(ele);
            if(queue1.size()>2) queue1.remove();
        }
        System.out.println("Second smallest number is: "+ queue1.peek());

        //for second LARGEST and third LARGEST, we have to use min-heap
        PriorityQueue<Integer>queue2=new PriorityQueue<>();
        for(int ele:arr){
            queue2.add(ele);
            if(queue2.size()>2)queue2.remove();
        }
        System.out.println("Second largest element is: "+queue2.peek());
        

    }
}
