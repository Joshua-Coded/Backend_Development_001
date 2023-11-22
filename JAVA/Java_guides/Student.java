import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String college;

    // constructor that returns the name of the student and its college
    public Student() {
        super();
    }

    public Student(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }

    // getters and setters for Student constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // the main method

    // public static void main(String[] args) throws Exception {
    // // use the student class to create objects
    // Student student = new Student("Joshua", "Alu");
    // Student student2 = new Student("Alana", "Alx");
    // Student student3 = new Student("Bami", "Ali");

    // System.out.println(student.getName() + " " + student.getCollege());
    // }
}