public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    /**
     * @param other
     */
    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double radius, double cost) {
        super(l, h, w, radius);
        this.cost = cost;
    }

    public BoxPrice(double side, double radius, double cost) {
        super(side, radius, cost, cost);
        this.cost = cost;
    }
}