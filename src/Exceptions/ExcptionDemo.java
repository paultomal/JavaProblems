package Exceptions;

import java.io.IOException;

public class ExcptionDemo {
    public static void Show() throws IOException {
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
