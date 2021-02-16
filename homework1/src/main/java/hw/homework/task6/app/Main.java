package hw.homework.task6.app;

import hw.homework.task6.data.NumberInputValidator;
import hw.homework.task6.data.TimeProcessor;

import java.util.Map;
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

        int inputSeconds = Integer.parseInt(inputString);

        Map<String,Integer> outputValues = new TimeProcessor().getHoursMinutesSeconds(inputSeconds);

        int hours = outputValues.get("hours");;
        int minutes = outputValues.get("minutes");;
        int seconds = outputValues.get("seconds");

        System.out.println("In " + inputString + " seconds there are "
                + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

    }

}
