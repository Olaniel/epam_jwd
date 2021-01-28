package hw2.task3.data;

import hw2.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SquareInputValidator implements InputValidator {

    private final Pattern squareNumberPattern = Pattern.compile("^\\d*[\\.|,]?\\d+$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher squareNumberMatcher = squareNumberPattern.matcher(testString);
            return squareNumberMatcher.find();
        }

        return false;
    }

}