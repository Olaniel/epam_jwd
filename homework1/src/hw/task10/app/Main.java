package hw.task10.app;

import hw.task1.data.NumberInputValidator;

import java.util.Scanner;

import static hw.task10.data.TablePrinter.printTable;

/*
    Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
    Результат представить в виде таблицы, первый столбец которой – значения аргумента,
    второй - соответствующие значения функции.
    F(x) = tg(x)
*/

public class Main {

    public static void main(String[] args) {

        String inputString;
        NumberInputValidator numberInputValidator = new NumberInputValidator();
        double a, b, h;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a:");
            inputString = sc.next();

        } while (!numberInputValidator.isValid(inputString));
        a = Double.parseDouble(inputString);

        do {
            System.out.println("Enter b:");
            inputString = sc.next();

        } while (!numberInputValidator.isValid(inputString));
        b = Double.parseDouble(inputString);

        do {
            System.out.println("Enter h:");
            inputString = sc.next();

        } while (!numberInputValidator.isValid(inputString));
        h = Double.parseDouble(inputString);

        sc.close();

        printTable(a, b, h);
    }

}
