import java.awt.*;

public class Circle {

    // my circle attribute
    Point center;
    double radius;

    // my methods

    // default constructor
    Circle() {
    }

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // method that returns a double

    double getParameters() {
        return 2 * Math.PI * this.radius;
    }

    // method that returns a the radius sqaure

    double getRadius() {
        return Math.PI * this.radius * this.radius;
    }

    // methods for setting center
    void setCenter(Point center) {
        this.center = center;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}