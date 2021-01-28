package hw2.task6.app;

import hw2.task6.data.NumberInputValidator;

import java.util.Scanner;

/*
    Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
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

        int temp = Integer.parseInt(inputString);
        int seconds = temp % 60;
        temp = (temp - seconds) / 60;
        int minutes = temp % 60;
        temp = (temp - minutes) / 60;
        int hours = temp % 60;
        System.out.println("In " + inputString + " seconds there are "
                + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

    }

}
