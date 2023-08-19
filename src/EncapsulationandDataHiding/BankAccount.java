package EncapsulationandDataHiding;

public class BankAccount {
    private int accountNumber;

    private int balance;
    private int pin;
    public BankAccount(int accountNumber, int balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawal(double amount, int enteredPin){
        if (enteredPin == pin)
            if (amount>0 && amount <= balance){
                balance -= amount;
                System.out.println("Withdrawal Successful.");
            }else System.out.println("Invalid ");
    }
    public void balance(int enteredPin){
        if (enteredPin == pin) {
            System.out.println(balance);
        } else {
            System.out.println("Incorrect PIN. Cannot retrieve balance.");
        }
    }

}
