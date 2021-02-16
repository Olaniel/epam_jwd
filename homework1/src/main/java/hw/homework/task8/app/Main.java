package hw.homework.task8.app;

import hw.homework.task1.data.NumberInputValidator;
import hw.homework.task8.data.FunctionCalculator;

import java.util.Scanner;

/*
 *    Вычислить значение функции:
 *
 *            { -x^2+3x+9, если x>=3;
 *     F(x) = {
 *            { 1/(x^3-6), если x<3
 */

public class Main {

    public static void main(String[] args) {

        String inputString;
        NumberInputValidator numberInputValidator = new NumberInputValidator();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your input value of x:");
            inputString = sc.next();

        } while (!numberInputValidator.isValid(inputString));

        sc.close();

        double x = Double.parseDouble(inputString);

        double result = new FunctionCalculator().calculate(x);

        System.out.println("F(x)=" + result);
    }
}
