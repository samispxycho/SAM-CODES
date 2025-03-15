package SEM2_LAB;

import java.util.Scanner;

class Employee {
    private String pan;
    private String name;
    private double taxIncome;
    private double tax;

    public void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN: ");
        pan = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Taxable Income: ");
        taxIncome = sc.nextDouble();
        sc.close();
    }

    public void TaxCalc() {
        if (taxIncome <= 250000) {
            tax = 0;
        } else if (taxIncome <= 300000) {
            tax = (taxIncome - 250000) * 0.10;
        } else if (taxIncome <= 400000) {
            tax = 5000 + (taxIncome - 300000) * 0.20;
        } else {
            tax = 25000 + (taxIncome - 400000) * 0.30;
        }
    }

    public void DisplayInfo() {
        System.out.println("PAN: " + pan);
        System.out.println("Name: " + name);
        System.out.println("Taxable Income: " + taxIncome);
        System.out.println("Tax: " + tax);
    }
}

public class TaxCalculator {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.InputInfo();
        emp.TaxCalc();
        emp.DisplayInfo();
    }
}