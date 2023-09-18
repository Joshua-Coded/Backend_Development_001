import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("John", 54);
        students.put("moses", 40);
        students.put("daniel", 5);
        students.put("victor", 4);
        students.put("Joshua", 45);

        System.out.println(students);
    }
}