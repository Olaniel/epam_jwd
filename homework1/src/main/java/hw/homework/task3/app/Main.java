package hw.homework.task3.app;

import hw.homework.task3.data.AreaCalculator;
import hw.homework.task3.data.AreaInputValidator;

import java.util.Scanner;

/*
    Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
	Во сколько раз площадь вписанного квадрата меньше площади заданного?
*/

public class Main {

    public static void main(String[] args) {

        String inputString;
        double inputSquare;
        AreaInputValidator areaInputValidator = new AreaInputValidator();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your square input value:");

            inputString = sc.next();
        } while (!areaInputValidator.isValid(inputString));

        inputSquare = Double.parseDouble(inputString);

        double result = new AreaCalculator().getInscribedCirclesArea(inputSquare);
        System.out.println("Smaller square area is:" + result);
        System.out.println("That's twice smaller than the input one");
    }
}
