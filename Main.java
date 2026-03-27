import java.util.Scanner;
import java.util.ArrayList;

class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    // Constructor
    BankAccount(String customerName, String accountNumber, double initialDeposit) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        history.add("Deposit: " + initialDeposit);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to show details
    void showDetails() {
        System.out.println("Your bank details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Show transaction history
    void showHistory() {
        System.out.println("Transaction History:");
        for (String t : history) {
            System.out.println(t);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer name:");
        String customerName = sc.nextLine();

        System.out.println("Enter the account number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter initial deposit amount:");
        double deposit = sc.nextDouble();

        // Create BankAccount object
        BankAccount b1 = new BankAccount(customerName, accountNumber, deposit);

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();

        b1.withdraw(withdrawAmount);

        b1.showDetails();
        b1.showHistory();
    }
}