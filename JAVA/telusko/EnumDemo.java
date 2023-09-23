// enum are name constants.

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String args[]) {

        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}