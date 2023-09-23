import java.util.ArrayList;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // instantiate the array list
        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100, "joe", "4354645465");

        accounts.add(new Account(1, 10000, 1.2, client));
        accounts.add(new Account(6, 40000, 1.2, client));

        for (Account account : accounts) {
            System.out.println("Account " + account.getId() + " :");
            System.out.println("W: " + account.countTransactions('W'));
            System.out.println("D: " + account.countTransactions('D'));
        }

    }
}