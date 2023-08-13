package Exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException();
        }
    }
    public void withdraw(float value) throws InsufficientBalanceException{
        if(value>balance)
            throw new InsufficientBalanceException();
    }
}
