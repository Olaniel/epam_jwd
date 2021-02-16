package hw.homework.task4.app;

import hw.homework.task4.data.EvenCounter;
import hw.homework.task4.data.NumberInputValidator;

import java.util.Scanner;

/*
    Составить программу, печатающую значение true, если указанное высказывание является истинным,
    и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных
*/

public class Main {

    public static void main(String[] args) {
        String inputString;
        NumberInputValidator numberInputValidator = new NumberInputValidator();

        long[] inputValues = new long[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            do {
                System.out.println("Enter your input value:");
                inputString = sc.next();

            } while (!numberInputValidator.isValid(inputString));

            inputValues[i] = Long.parseLong(inputString);
            System.out.println("accepted");
        }
        sc.close();

        int evenCounter = new EvenCounter().count(inputValues);
        boolean result = (evenCounter >= 2);
        System.out.println(result);
    }

}
