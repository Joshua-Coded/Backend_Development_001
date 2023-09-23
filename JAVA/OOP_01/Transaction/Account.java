import java.util.Date;
import java.awt.*;
import java.util.ArrayList;

public class Account {

    // Account Attributes

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;

    // constructors for Account

    public Account(int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;

        // instantiate the transaction array list
        this.transactions = new ArrayList<>();

        // instantiate the date created
        dateCreated = new Date();
    }

    // the withdraw method.

    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            this.transactions.add(new Transaction('W', amount, this.balance, "Withdrawn " + amount));
            return true;
        }

        return false;
    }

    // the deposit method.

    public void deposit(double amount) {
        balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited " + amount));
    }

    // getter and setters for our properties

    public int countTransactions(char type) {
        int count = 0;

        for (Transaction transaction : transactions) {
            if (transaction.getType() == type) {
                count++;
            }
        }

        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // the getter an setter for our client

    public Client gClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString() {
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

}