import java.awt.*;

// Banking system OOP

public class Main {
    public static void main(String[] args) {

        // instantiate the object
        Account testAccount = new Account(2222, 30000, 5.3);

        if (testAccount.withdraw(2000)) {
            System.out.println("Withdrawal SuccessFul!");
        } else {
            System.out.println("withdrawal Failed!");
        }

        // make deposit into the account

        testAccount.deposit(3000);

        System.out.println(testAccount.getId() + " " + testAccount.getBalance() + " "
                + testAccount.getAnnualInterestRate() + " " + testAccount.getDateCreated());

    }
}