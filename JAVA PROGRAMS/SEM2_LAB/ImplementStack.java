package SEM2_LAB;

import java.util.Scanner;

class Stackk {

    int top = -1;
    int arr[];

    Stackk(int size) {
        arr = new int[size];
    }

    void push(int ele) {
        if (top >= arr.length - 1) {
            System.out.println("STACK OVERFLOW");
            return;
        }
        System.out.println("Element pushed: " + ele);
        arr[++top] = ele;
    }

    int pop() {
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        return arr[top--];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ImplementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        Stackk st = new Stackk(size);

        while (true) {
            System.out.println("\n1: Push\n2: Pop\n3: Display\n4: Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to enter: ");
                    int ele = sc.nextInt();
                    st.push(ele);
                    break;

                case 2:
                    int popped = st.pop();
                    if (popped != -1) {
                        System.out.println("Popped element is: " + popped);
                    }
                    break;

                case 3:
                    st.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
        }
    }
}
