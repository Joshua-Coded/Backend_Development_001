import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // instantiate the client class

        Client[] client = new Client[2];

        client[0] = new Client(100, "joshua", "75837503748274");
        // add new account to this clients
        client[0].addAccount(new Account(1, 500, 3.2));
        client[0].addAccount(new Account(3, 5000, 1.2));

        client[1] = new Client(200, "ronald", "025025380348343");
        // add account to the client
        client[1].addAccount(new Account(10, 10000, 5.5));
        client[1].addAccount(new Account(11, 34000, 2.5));
        client[1].addAccount(new Account(5, 90000, 1.5));

        System.out.println(client[0].toString());
        System.out.println(client[1].toString());

    }
}
