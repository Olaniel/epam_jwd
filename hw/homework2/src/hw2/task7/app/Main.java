package hw2.task7.app;

import hw2.task7.data.CoordinateInputValidator;

import java.util.Scanner;

/*
    Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм,
    определяющий, которая из точек находится ближе к началу координат. x y.
*/

public class Main {

    public static void main(String[] args) {
        String inputString;
        CoordinateInputValidator coordinateInputValidator = new CoordinateInputValidator();
        double x1;
        double x2;
        double y1;
        double y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("For the point A:");
        do {
            System.out.println("Enter x:");
            inputString = sc.next();

        } while (!coordinateInputValidator.isValid(inputString));
        x1 = Double.parseDouble(inputString);

        do {
            System.out.println("Enter y:");
            inputString = sc.next();

        } while (!coordinateInputValidator.isValid(inputString));

        y1 = Double.parseDouble(inputString);


        System.out.println("For the point B:");
        do {
            System.out.println("Enter x:");
            inputString = sc.next();

        } while (!coordinateInputValidator.isValid(inputString));

        x2 = Double.parseDouble(inputString);

        do {
            System.out.println("Enter y:");
            inputString = sc.next();

        } while (!coordinateInputValidator.isValid(inputString));

        y2 = Double.parseDouble(inputString);

        sc.close();

        double aRange = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double bRange = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (aRange < bRange) {
            System.out.println("Point A is closer to the origin");
        } else if (aRange > bRange) {
            System.out.println("Point B is closer to the origin");
        } else {
            System.out.println("Points have equal ranges to the origin");
        }

    }
}
