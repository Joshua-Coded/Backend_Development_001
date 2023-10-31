/**
 * @Author Joshua alana
 */

public class ArrayBasics {
    public static void main(String[] args) {
        int[] anArray = new int[5];

        anArray[0] = 10;
        anArray[1] = 20;
        anArray[2] = 30;
        anArray[3] = 40;
        anArray[4] = 50;

        // print each array

        System.out.println(anArray[0]);
        System.out.println(anArray[1]);
        System.out.println(anArray[2]);
        System.out.println(anArray[3]);
        System.out.println(anArray[4]);

        // initialize the string array
        String[] stringArray = new String[5];
        stringArray[0] = "abc";
        stringArray[1] = "xy";
        stringArray[2] = "xyz";
        stringArray[3] = "xz";
        stringArray[4] = "z";

        // print individual elements of the string array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);
        System.out.println(stringArray[4]);

        Employee[] employee = new Employee[2];
        employee[0] = new Employee(10, "John");
        employee[1] = new Employee(20, "bose");

        System.out.println(employee[0].getName());
        System.out.println(employee[1].getName());

    }
}

// the employee class
class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}