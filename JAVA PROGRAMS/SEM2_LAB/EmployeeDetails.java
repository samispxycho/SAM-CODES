package SEM2_LAB;

import java.util.Scanner;

class InvalidEmployeeDataException extends Exception {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee Name (Uppercase only): ");
            String empName = scanner.nextLine();
            if (!empName.matches("[A-Z]+")) {
                throw new InvalidEmployeeDataException("Employee name must be in uppercase alphabets only.");
            }
            System.out.print("Enter Employee Designation (Manager/Clerk/Peon): ");
            String designation = scanner.nextLine();
            if (!designation.equals("Manager") && !designation.equals("Clerk") &&
                    !designation.equals("Peon")) {
                throw new InvalidEmployeeDataException("Invalid designation! Allowed: Manager, Clerk,Peon.");
            }
            System.out.print("Enter Department ID (1-5): ");
            int deptId = scanner.nextInt();
            if (deptId < 1 || deptId > 5) {
                throw new InvalidEmployeeDataException("Department ID must be between 1 and 5.");
            }
            System.out.println("\nEmployee Details:");
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Designation: " + designation);
            System.out.println("Department ID: " + deptId);
        } catch (InvalidEmployeeDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct values.");
        } finally {
            scanner.close();
        }
    }
}