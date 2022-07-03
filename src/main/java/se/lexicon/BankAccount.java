package se.lexicon;
/**
 * Part 3
 * Create an BankAccount class.
 * • A Bank Account should consist of a unique identifier, balance, and who the account is
 * connected to.
 * • The User should be able to withdraw and deposit from the Bank Account.
 * o Make use of encapsulation.
 * o Validate the input.
 * ▪ Do not allow negative Withdraws or Deposits.
 * ▪ Do not allow withdraws that is more than the available balance.
 * • Make sure to test the functionality with JUnit testing framework.
 * • Commit changes and Push to Github
 */
public class BankAccount {
    private String identifier;
    private double balance;
    private String user;

    public BankAccount (double balance){
        this.balance =balance;
    }

    public  BankAccount (String identifier, double balance, String user){
        this.identifier= identifier;
        this.balance =balance;
        this.user = user;
    }
    //method 1
    /*
    public String withDraw(double amount){
        if (amount<0){
            return "Negative amount, not allowed";
        }else if(amount >balance){
            return "Amount is greater than the balance, invalid amount";
        }
        balance = balance - amount;
        return "Your current balance is: " + getBalance();
    }*/

    //method 2
    private boolean validWithDraw(double amount){
        return !(balance - amount < 0) && !(amount < 0);
    }
    public double withDraw(double amount){
        if(validWithDraw(amount)){
            this.balance -=amount;
            return amount;
        }
        return -1;
    }

    public void deposit(double amount){
        if (amount>0){
            balance = balance +amount;
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "identifier='" + identifier + '\'' +
                ", balance=" + balance +
                ", user='" + user + '\'' +
                '}';
    }
}
