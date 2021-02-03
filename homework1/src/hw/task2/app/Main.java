package hw.task2.app;

import hw.task2.data.MonthInputValidator;
import hw.task2.data.YearInputValidator;

import java.util.Scanner;

import static hw.task2.data.DateProcessor.getDaysInMonth;

/*
    Составить программу, которая по заданным году и номеру месяца
    определяет количество дней в этом месяце и корректно определялись все високосные года.
 */

public class Main {

    public static void main(String[] args) {

        String inputString;
        YearInputValidator yearInputValidator = new YearInputValidator();
        MonthInputValidator monthInputValidator = new MonthInputValidator();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your year input value:");

            inputString = sc.next();
        } while (!yearInputValidator.isValid(inputString));

        int year = Integer.parseInt(inputString);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your month input value:");

            inputString = sc.next();
        } while (!monthInputValidator.isValid(inputString));

        int month = Integer.parseInt(inputString);

        int daysInMonth = getDaysInMonth(month,year);

        System.out.println("The quantity of days in the chosen month is " + daysInMonth + ".");
    }

}
