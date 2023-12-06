package QUEUE;
import java.util.*;

public class QueueUsingStack {

    Stack<Integer>input=new Stack<>();
    Stack<Integer>output=new Stack<>();

    public void add(int x){
        input.push(x);
    }

    public int remove(){
        int ele = 0;
        if(!output.empty()){
            ele = output.pop();
        }else{
            while(!input.empty()){
                output.push(input.pop());
            }
            ele = output.pop();
        }
        return ele;
    }

    public int peek(){
        int ele=0;
        if(!output.empty()){
            ele = output.peek();
        }else{
            while(!input.empty()){
                output.push(input.pop());
            }
            ele = output.peek();
        }
        return ele;
    }

    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        obj.add(5);
        obj.add(6);
        obj.add(7);

        System.out.println(obj.peek());
        System.out.println(obj.remove());
        System.out.println(obj.peek());

    }
}
