package hw.task9.app;

import hw.task1.data.NumberInputValidator;

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
        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("Circle length is " + length);
        System.out.println("Circle area is " + area);
    }

}
