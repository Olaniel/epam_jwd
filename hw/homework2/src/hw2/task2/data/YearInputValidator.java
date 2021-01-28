package hw2.task2.data;

import hw2.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YearInputValidator implements InputValidator {

    private final Pattern yearNumberPattern = Pattern.compile(
            "^((1?[1-9][0-9]{0,8})|20[0-9]{8}|(21[0-3][0-9]{7})|(214[0-6][0-9]{6})\n" +
                    "|(2147[0-3][0-9]{5})|(21474[0-7][0-9]{4})|(214748[0-2][0-9]{3})\n" +
                    "|(2147483[0-5][0-9]{2})|(21474836[0-3][0-9])|(214748364[0-7]))$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher yearNumberMatcher = yearNumberPattern.matcher(testString);
            return yearNumberMatcher.find();
        }

        return false;
    }

}