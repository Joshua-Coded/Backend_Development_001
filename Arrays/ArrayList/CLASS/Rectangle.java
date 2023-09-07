
public class Rectangle {
    // attributes

    private double width;
    private double height;

    // first contructor that doesn't take any parameters

    public Rectangle() {
        this(1.0, 1.0);
    }

    // the second contructor that takes parameters

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // the getter and setter methods for accessing the private properties

    public double getArea() {
        return this.width * this.height;
    }

    // the get parameter method

    public double getParameter() {
        return 2 * (this.height + this.width);
    }

    // the actual getter and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}