package SEM2_LAB;

import java.util.Scanner;

class Stack{
    int arr[];
    int top=-1;

    Stack(int size){
        arr=new int[size];
    }

    void push(int ele){
        if(top==arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        top+=1;
        arr[top]=ele;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped element is: "+arr[top]);
        top-=1;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of stack you want: ");
        size=sc.nextInt();
        Stack stack=new Stack(size);

        int choice;
        
        while(true){
            System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to display\nEnter 4 to exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    int ele;
                    System.out.print("Enter element to push: ");
                    ele=sc.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(0);
            }

        }

    }
}
