package hw.task3.app;

import hw.task3.data.SquareInputValidator;

import java.util.Scanner;

/*
    Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
	Во сколько раз площадь вписанного квадрата меньше площади заданного?
*/

public class Main {

    public static void main(String[] args) {

        String inputString;
        double inputSquare;
        SquareInputValidator squareInputValidator = new SquareInputValidator();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your square input value:");

            inputString = sc.next();
        } while (!squareInputValidator.isValid(inputString));

        inputSquare = Double.parseDouble(inputString);

/*
    Исходя из того,что величина стороны большего квадрата равна величине диагонали меньшего квадрата,
    после выражения площадей квадратов через величину стороны меньшего квадрата,
    получим что площадь вписанного квадрата меньше площади большего квадрата в два раза.
*/
        double result = inputSquare/2;
        System.out.println("Smaller square area is:" + result);
        System.out.println("That's twice smaller than the input one");
    }
}
