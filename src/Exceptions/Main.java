package Exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExcptionDemo.Show();
        } catch (IOException e) {
            System.out.println("An Unexpected Error!!");
        }
    }

}
