package STACK;

class Stack{

    int top = -1;
    int arr[];

    Stack(int n){
        arr = new int[n];
    }

    public void push(int ele){
        top++;
        arr[top] = ele;
    }

    public int pop(){
        
        int popped = arr[top];
        arr[top] = -1;
        top--;

        return popped;
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return top+1;
    }
}


public class StackUsingArr {
    public static void main(String[] args) {

        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Current size is "+ s.size());
        System.out.println("Topmost element is "+ s.peek());
        System.out.println("Popped element is "+ s.pop());
        System.out.println("Current size is "+ s.size());
        System.out.println("Topmost element is "+ s.peek());


    }    
}
