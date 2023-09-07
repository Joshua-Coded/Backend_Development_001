import java.awt.Point;
// import java.util.Circle;

public class Main {

    public static void main(String[] args) {
        // let's use circle class

        Circle c1 = new Circle(new Point(1, 2), 3);

        System.out.println("The area of a circle is: " + c1.getArea());
        System.out.println("The parameters of a circle is: " + c1.getParameters());
        // System.out.println("The area of a circle is: " + c1.getArea());
    }

}