
public class Box {
    double l;
    double h;
    double w;

    // contructor

    Box() {
        this.l = -1;
        this.h = 3;
        this.w = -1;
    }

    // creating another angle box.
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.h = old.h;
    }

    public void Information() {
        System.out.println("Running the box");
    }
}
