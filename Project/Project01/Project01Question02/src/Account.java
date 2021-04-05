import java.util.Scanner;
import java.util.Date;
public class Account {
    Scanner input = new Scanner(System.in);
    private int id; //for the account (default 0).
    private double balance;
    private double annualInterestRate = 0; // that stores the current interest rate Assume that all accounts have the same interest rate.
	private Date dateCreated; // that stores the date when the account was created.
    //A no-arg constructor that creates a default account.
    Account() {
        // use this as I am addressing the values in this class
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
	//A constructor that creates an account with the specified id and initial balance.
    Account(int ID, double bal) {
        id = ID;
        balance = bal;
    }
	//The accessor and mutator methods for id, balance, and annualInterestRate.
    void setId(int val) {
        id = val;
    }
    // accesses the id
    int getId() {
        return id;
    }
    // modifies the balance
    void setBalance(double bal) {
        balance = bal;
    }
    // accesses the balance
    double getBalance() {
        return balance;
    }
    // modifies the annualInterestRate
    void setAnnualInterestRate(double air) {
        annualInterestRate = air;
    }
    // accesses the annualInterestRate
    double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //The accessor method for dateCreated.
    Date dateCreated() {
        return dateCreated;
    }
    //A method named getMonthlyInterestRate() that returns the monthly interest rate.
    double getMonthlyInterestRate() {
        // monthlyInterestRate = annualInterestRate / 12
        return annualInterestRate / 12;
    }
    //A method named getMonthlyInterest() that returns the monthly interest not the interest rate.
    double getMonthlyInterest() {
        //double mi =  balance * getMonthlyInterestRate();
        return balance * getMonthlyInterestRate();
    }
    //A method named withdraw that withdraws a specified amount from the account.
    void withdraw() {
        System.out.print("Enter an amount to withdraw: ");
        double amount = input.nextDouble(); // user input double value
        input.nextLine(); // clear input
        balance = balance - amount; // new balance
        System.out.println();
    }
    //A method named deposit that deposits a specified amount to the account.
    void deposit() {
        System.out.print("Enter an amount to deposit: ");
        double amount = input.nextDouble(); // user input double value
        input.nextLine(); // clear input
        balance = balance + amount; // new balance
        System.out.println();
    }


}
