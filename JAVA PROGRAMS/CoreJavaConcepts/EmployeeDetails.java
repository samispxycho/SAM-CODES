import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();
            if (!empName.matches("[A-Z]+")) throw new InvalidInputException("Employee name should be in uppercase and contain alphabets only.");

            System.out.print("Enter Designation (Manager/Clerk/Peon): ");
            String designation = sc.nextLine();
            if (!(designation.equals("Manager") || designation.equals("Clerk") || designation.equals("Peon"))) 
                throw new InvalidInputException("Designation should be 'Manager', 'Clerk', or 'Peon' only.");

            System.out.print("Enter Department ID (1-5): ");
            int deptId = sc.nextInt();
            if (deptId < 1 || deptId > 5) throw new InvalidInputException("Department ID should be between 1 and 5.");

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + empId);
            System.out.println("Name: " + empName);
            System.out.println("Designation: " + designation);
            System.out.println("Department ID: " + deptId);

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
