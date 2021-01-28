package hw2.task1.app;

import hw2.task1.data.NumberInputValidator;
import java.util.Scanner;

/*
    Написать программу, позволяющую по последней цифре числа определить
    последнюю цифру его квадрата.
 */

public class Main {

    public static void main(String[] args) {

        String inputString;
        NumberInputValidator numberInputValidator = new NumberInputValidator();

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your input value:");

            inputString = sc.next();
        } while (!numberInputValidator.isValid(inputString));

        sc.close();

        long lastInputDigit = Long.parseLong(inputString) % 10;

        System.out.println("The last digit of the input's square is ");
        System.out.print((lastInputDigit * lastInputDigit) % 10);

    }

}
