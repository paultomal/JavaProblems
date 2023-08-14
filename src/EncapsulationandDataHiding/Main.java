package EncapsulationandDataHiding;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10, 10000, 1122);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(10000,1122);
        bankAccount.balance(1122);
    }
}
