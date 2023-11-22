import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDemo {
    public static void main(String[] args) {
        // create a path to store the serialized student
        String path = "sample.txt";

        Student s1 = new Student("Alana", "ALU");

        try {
            // serializing the student object
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            // deserialize the object

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();

            ois.close();

            System.out.println(s2.getName());
            System.out.println(s2.getCollege());

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}