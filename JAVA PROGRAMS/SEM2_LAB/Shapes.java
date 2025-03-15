package SEM2_LAB;

import java.util.Scanner;

abstract class Shape{
    abstract void getPeri();
    abstract void getArea();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void getPeri(){
        double peri=2*Math.PI*radius;
        System.out.println("Perimeter of the circle is: "+peri);
    }
    void getArea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of the circle is: "+area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius=sc.nextInt();
        Circle obj=new Circle(radius);
        obj.getPeri();
        obj.getArea();
    }
}
