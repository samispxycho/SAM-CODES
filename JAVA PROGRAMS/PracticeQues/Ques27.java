class Employee
{
    String name;
    int salary;

    public int getsalary()
    {
        return salary;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String n)
    {
        name=n;
    }
}

public class Ques27 {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.name="SameerUpadhyay";
        obj1.salary=55000;

        System.out.println("Salary of the person is "+obj1.getsalary());
        System.out.println("Name of the person is "+obj1.getname());

        System.out.println("After changing the name");
        obj1.setname("Geminitay");
        System.out.println("Name is now "+obj1.getname());
        
    }
}
