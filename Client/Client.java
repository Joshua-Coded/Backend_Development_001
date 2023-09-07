import java.util.ArrayList;
import java.awt.*;

public class Client {

    // the client attributes
    private int id;
    private String name;
    private String phone;
    ArrayList<Account> accounts;

    // the constructors

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

        // instantiate the array list

        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        accounts.add(account);
        return true;
    }

    public boolean removeAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                accounts.remove(account);
                return true;
            }
            return false;
        }
    }

    // the toString method
    public String toString() {
        String s = this.id + " " + this.name + " " + this.phone + "\n";

    }

    // the setters and the getters

}