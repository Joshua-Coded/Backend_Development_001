
// TRANSACTION CLASS
import java.util.Date;

public class Transaction {

    // get the attributes of the transaction
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;

    // get the constructor

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        // instantiate the date

        this.date = new Date();
    }

    // the getter
    public char getType() {
        return type;
    }
}