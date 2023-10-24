public class InstanceVaribales {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // before assigning values to employee objet
        System.out.println(employee.id);
        System.out.println(employee.empName);
        System.out.println(employee.age);

        employee.empName = "Joshua Alana";
        employee.id = 100;
        employee.age = 16;

        // after assigning values to employee object
        System.out.println(employee.empName);
        System.out.println(employee.id);
        System.out.println(employee.age);
    }
}

class Employee {
    public int id;
    public String empName;
    public int age;
}