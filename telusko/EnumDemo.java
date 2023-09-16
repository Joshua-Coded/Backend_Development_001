// enum are name constants.

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String args[]) {

        Status[] statuses = Status.values();

        for (Status status : statuses) {
            System.out.println(status + " : " + status.ordinal());
        }

    }
}