package hw.homework.task2.data;

import hw.homework.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MonthInputValidator implements InputValidator {

    private final Pattern monthNumberPattern = Pattern.compile("^([0][1-9]|[1-9]|[1][012])$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher monthNumberMatcher = monthNumberPattern.matcher(testString);
            return monthNumberMatcher.find();
        }

        return false;
    }

}