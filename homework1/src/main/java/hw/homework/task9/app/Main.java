package hw.homework.task9.app;

import hw.homework.task1.data.NumberInputValidator;
import hw.homework.task9.data.CircleProcessor;

import java.util.Scanner;

/*
    Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
*/

public class Main {

    public static void main(String[] args) {

        String inputString;
        NumberInputValidator numberInputValidator = new NumberInputValidator();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the radius:");
            inputString = sc.next();

        } while (!numberInputValidator.isValid(inputString));

        sc.close();

        double r = Double.parseDouble(inputString);

        CircleProcessor circleProcessor = new CircleProcessor();

        double length = circleProcessor.getLength(r);
        double area = circleProcessor.getArea(r);

        System.out.println("Circle length is " + length);
        System.out.println("Circle area is " + area);
    }

}
