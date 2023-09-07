import java.util.Date;

public class Account {

    // Account Attributes

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // constructors for Account

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

        // instantiate the date created

        dateCreated = new Date();
    }

    // the withdraw method.

    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    // the deposit method.

    public void deposit(double amount) {
        balance += amount;
    }

    // getter and setters for our properties

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

    public String toString() {
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

}