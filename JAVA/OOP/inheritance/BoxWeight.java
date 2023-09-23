
public class BoxWeight extends Box {
    double radius;

    public BoxWeight() {
        this.radius = -10;
    }

    public BoxWeight(double l, double h, double w, double radius) {
        super(l, h, w);
        this.radius = radius;
    }

    public BoxWeight(BoxPrice old) {
    }

}