package STACK;
import java.util.*;

public class StackUsingQueue {

    Queue<Integer>q1=new LinkedList<Integer>();

    public void push(int x){
        q1.add(x);
        for(int i=0;i<q1.size()-1;i++){
            q1.add(q1.peek());
            q1.remove();
        }
    }

    public int pop(){
        return q1.remove();
    }

    public int peek(){
        return q1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        obj.push(5);
        obj.push(6);
        obj.push(7);

        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}
