package hw.homework.task5.app;

import hw.homework.task5.data.DividersSumCalculator;
import hw.homework.task5.data.NumberInputValidator;

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

        long dividersSum = new DividersSumCalculator().sumDividers(input);

        boolean result = (dividersSum == input);
        System.out.println(result);

    }
}
