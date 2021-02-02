package hw2.task8.app;

import hw2.task1.data.NumberInputValidator;

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

        double result;
        if (x >= 3) {
            result = 9 - Math.pow(x, 2) + 3 * x;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("F(x)=" + result);
    }
}
