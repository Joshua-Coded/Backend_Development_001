// enum are name constants.

enum Status {
    Running, Failed, Pending, Success;
}

public class ConditionalEnumDemo {
    public static void main(String args[]) {

        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("the bag is running");
                break;
            case Failed:
                System.out.println("the bag failed to run");
                break;
            case Pending:
                System.out.println("the bag has pending tasks");
                break;
            default:
                System.out.println("the bag is ran successfully");
                break;
        }

    }
}