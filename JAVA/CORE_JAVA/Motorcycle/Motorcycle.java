public class Motorcycle {

    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.make = "joshua motor's";
        m.color = "green";
        System.out.println("calling the showAtt");
        m.showAtt();
        System.out.println("-----------------");
        m.startEngine();
        System.out.println("the car engine");
    }

    String make;
    String color;
    boolean engineState;;

    // first methods
    void startEngine() {
        if (engineState == true) {
            System.out.println("the engine started already");
        } else {
            engineState = true;
            System.out.println("the car engine is on now");
        }
    }

    void showAtt() {
        System.out.println("the motorcycle is a  " + color + " " + make);
        if (engineState == true) {
            System.out.println("the car engine is on now");
        } else {
            System.out.println("the engine is off now");
        }
    }
}