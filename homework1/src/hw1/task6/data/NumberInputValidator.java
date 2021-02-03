package hw1.task6.data;

import hw1.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInputValidator implements InputValidator {

    private final Pattern numberPattern = Pattern.compile(
            "^(86400)|(86[0-3][\\d]{2})|(8[0-5][\\d]{3})|([1-7][\\d]{4})|[\\d]{1,4}$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher numberMatcher = numberPattern.matcher(testString);
            return numberMatcher.find();
        }

        return false;
    }

}
