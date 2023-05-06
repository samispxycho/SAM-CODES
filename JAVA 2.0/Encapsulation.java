
class Employee{
    private int id;
    public void setId(int id1){
        id=id1;
    }
    public int getId(){
        return id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(101);
        System.out.println(emp.getId());
    }
}
