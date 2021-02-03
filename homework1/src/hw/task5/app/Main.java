package hw.task5.app;

import hw.task5.data.NumberInputValidator;

import java.util.Scanner;

/*
    Составить программу, печатающую значение true, если указанное высказывание является истинным,
    и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
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

        long input = Long.parseLong(inputString);

        long dividersSum = 0;

        for (long i = 1; i < input; i++) {

            if (input % i == 0) {
                dividersSum += i;
            }
        }
        boolean result = (dividersSum == input);
        System.out.println(result);

    }
}
